package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroA, txtNumeroB, txtNumeroC, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroA = new JLabel("Numero A: ");
        lblNumeroA.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumeroA);

        txtNumeroA = new JTextField();
        txtNumeroA.setBounds(150, 30, 100, 30);
        txtNumeroA.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroA);

        JLabel lblNumeroB = new JLabel("Numero B: ");
        lblNumeroB.setBounds(50, 70, 100, 30);
        getContentPane().add(lblNumeroB);

        txtNumeroB = new JTextField();
        txtNumeroB.setBounds(150, 70, 100, 30);
        txtNumeroB.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroB);

        JLabel lblNumeroC = new JLabel("Numero C: ");
        lblNumeroC.setBounds(50, 110, 100, 30);
        getContentPane().add(lblNumeroC);

        txtNumeroC = new JTextField();
        txtNumeroC.setBounds(150, 110, 100, 30);
        txtNumeroC.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroC);

        JButton btnVerificar = new JButton("Verificar Orden");
        btnVerificar.setBounds(50, 150, 200, 30);
        btnVerificar.addActionListener(e -> btnVerificar_actionPerformed());
        getContentPane().add(btnVerificar);

        Jlabel lblResultado = new Jlabel("Resultado: ");
        lblResultado.setBounds(50, 190, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 190, 200, 30);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }
    protected void btnVerificar_actionPerformed(){
        int a = Integer.parseInt(txtNumeroA.getText());
        int b = Integer.parseInt(txtNumeroB.getText());
        int c = Integer.parseInt(txtNumeroC.getText());
        String resultado;

        if ( a < b && b < c){
            resultado = "Ascendente";
        } else if (a > b && b > c) {
            resultado = "Descendente";
        } else {
            resultado = "Desordenado";
        }
        txtResultado.setText(resultado);
    }
}