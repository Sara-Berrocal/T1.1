package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtDia;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm12 frame = new frm12();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero= new JLabel("Numero (1-7): ");
        lblNumero.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Determinar Dia ");
        btnCalcular.setBounds(50, 80, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblDia = new Jlabel("Dia: ");
        lblDia.setBounds(50, 130, 80, 30);
        getContentPane().add(lblDia);

        txtDia = new JTextField();
        txtDia.setBounds(150, 130, 100, 30);
        txtDia.setEditable(false);
        getContentPane().add(txtDia);

    }

    protected void btnCalcular_actionPerformed(){

        int numero = Integer.parseInt(txtNumero.getText());
        String dia;

        switch (numero) {
            case 1: dia = "Lunes"; break:
            case 2: dia = "Martes"; break:
            case 3: dia = "Miercoles"; break:
            case 4: dia = "Jueves"; break:
            case 5: dia = "Viernes"; break:
            case 6: dia = "Sabado"; break:
            case 7: dia = "Domingo"; break:
            default: dia = "invalido"; break:
        }

        txtDia.setText(dia);
    } 
}