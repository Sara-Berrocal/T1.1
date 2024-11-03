package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm36 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCuadernos, txtLapiceros;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm36 frame = new frm36();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm36() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuadernos = new JLabel("Número de Cuadernos:");
        lblCuadernos.setBounds(30, 30, 150, 30);
        getContentPane().add(lblCuadernos);

        txtCuadernos = new JTextField();
        txtCuadernos.setBounds(180, 30, 100, 30);
        txtCuadernos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCuadernos);

        JButton btnCalcular = new JButton("Calcular Lapiceros");
        btnCalcular.setBounds(30, 80, 220, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        JLabel lblLapiceros = new JLabel("Total Lapiceros Obsequiados:");
        lblLapiceros.setBounds(30, 130, 200, 30);
        getContentPane().add(lblLapiceros);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(220, 130, 60, 30);
        txtLapiceros.setEditable(false);
        getContentPane().add(txtLapiceros);
    }

    protected void btnCalcular_actionPerformed() {
        int cuadernos = Integer.parseInt(txtCuadernos.getText());
        int lapiceros = 0;

        if (cuadernos >= 12 && cuadernos < 24) {
            lapiceros = cuadernos / 4;
        } else if (cuadernos >= 24 && cuadernos < 36) {
            lapiceros = (2 * (cuadernos / 4));
        } else if (cuadernos >= 36) {
            lapiceros = (2 * (cuadernos / 4)) + (cuadernos / 6) + (cuadernos / 12);
        }

        txtLapiceros.setText(String.valueOf(lapiceros));
    }
}