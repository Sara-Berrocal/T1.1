package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtResultado;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero= new JLabel("Numero (3cifras): ");
        lblNumero.setBounds(50, 30, 130, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Verificar ");
        btnCalcular.setBounds(50, 80, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblResultado = new Jlabel("Resultado: ");
        lblResultado.setBounds(50, 130, 80, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(130, 130, 120, 30);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);

    }

    protected void btnCalcular_actionPerformed(){

        int numero = Integer.parseInt(txtNumero.getText());
       
        if (numero < 100 || numero > 999) {
            txtResultado.setText("Numero invalido");
            return;
        }
        int cifra1 = numero / 100;
        int cifra2 = (numero / 10) % 10;
        int cifra3 = numero % 10;

        if ((cifra2 == cifra1 + 1 && cifra3 == cifra2 + 1) ||
            (cifra2 == cifra1 - 1 && cifra3 == cifra2 - 1)){
            txtResultado.setText("Cifras consecutivas");
        } else {
            txtResultado.setText("Cifras no consecutivas");
        }
    }
}