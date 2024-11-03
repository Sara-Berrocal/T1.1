package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm39 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasAusencia, txtTornillosDefectuosos, txtTornillosNoDefectuosos, txtGradoEficiencia;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm39 frame = new frm39();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm39() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasAusencia = new JLabel("Horas de Ausencia:");
        lblHorasAusencia.setBounds(20, 20, 150, 30);
        getContentPane().add(lblHorasAusencia);

        txtHorasAusencia = new JTextField();
        txtHorasAusencia.setBounds(180, 20, 50, 30);
        txtHorasAusencia.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtHorasAusencia);

        JLabel lblTornillosDefectuosos = new JLabel("Tornillos Defectuosos:");
        lblTornillosDefectuosos.setBounds(20, 60, 150, 30);
        getContentPane().add(lblTornillosDefectuosos);

        txtTornillosDefectuosos = new JTextField();
        txtTornillosDefectuosos.setBounds(180, 60, 50, 30);
        txtTornillosDefectuosos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTornillosDefectuosos);

        JLabel lblTornillosNoDefectuosos = new JLabel("Tornillos No Defectuosos:");
        lblTornillosNoDefectuosos.setBounds(20, 100, 150, 30);
        getContentPane().add(lblTornillosNoDefectuosos);

        txtTornillosNoDefectuosos = new JTextField();
        txtTornillosNoDefectuosos.setBounds(180, 100, 50, 30);
        txtTornillosNoDefectuosos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTornillosNoDefectuosos);

        JButton btnCalcular = new JButton("Calcular Grado");
        btnCalcular.setBounds(20, 140, 160, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        txtGradoEficiencia = new JTextField();
        txtGradoEficiencia.setBounds(20, 180, 240, 30);
        txtGradoEficiencia.setEditable(false);
        getContentPane().add(txtGradoEficiencia);
    }

    protected void btnCalcular_actionPerformed() {
        double horasAusencia = Double.parseDouble(txtHorasAusencia.getText());
        int tornillosDefectuosos = Integer.parseInt(txtTornillosDefectuosos.getText());
        int tornillosNoDefectuosos = Integer.parseInt(txtTornillosNoDefectuosos.getText());

        int gradoEficiencia;

        boolean cumplePrimera = horasAusencia <= 1.5;
        boolean cumpleSegunda = tornillosDefectuosos < 300;
        boolean cumpleTercera = tornillosNoDefectuosos > 10000;

        if (cumplePrimera && cumpleSegunda && cumpleTercera) {
            gradoEficiencia = 20;
        } else if (cumplePrimera && cumpleSegunda) {
            gradoEficiencia = 12;
        } else if (cumplePrimera && cumpleTercera) {
            gradoEficiencia = 13;
        } else if (cumpleSegunda && cumpleTercera) {
            gradoEficiencia = 15;
        } else if (cumplePrimera) {
            gradoEficiencia = 7;
        } else if (cumpleSegunda) {
            gradoEficiencia = 8;
        } else if (cumpleTercera) {
            gradoEficiencia = 9;
        } else {
            gradoEficiencia = 5;
        }

        txtGradoEficiencia.setText("Grado de Eficiencia: " + gradoEficiencia);
    }
}