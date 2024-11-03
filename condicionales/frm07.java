package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtNumeroIntermedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1= new JLabel("Numero 1: ");
        lblNumero1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblNumero1);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(150, 30, 60, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero1);

        JLabel lblNumero2= new JLabel("Numero 2: ");
        lblNumero2.setBounds(50, 80, 80, 30);
        getContentPane().add(lblNumero2);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(150, 80, 60, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero2);

        JLabel lblNumero3= new JLabel("Numero 3: ");
        lblNumero3.setBounds(50, 130, 80, 30);
        getContentPane().add(lblNumero3);

        txtNumero3 = new JTextField();
        txtNumero3.setBounds(150, 130, 60, 30);
        txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero3);


        JButton btnCalcular = new JButton("Calcular Intermedio");
        btnCalcular.setBounds(80, 180, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblNumeroIntermedio = new Jlabel("Numero Intermedio: ");
        lblNumeroIntermedio.setBounds(50, 220, 150, 30);
        getContentPane().add(lblNumeroIntermedio);

        txtNumeroIntermedio = new JTextField();
        txtNumeroIntermedio.setBounds(200, 220, 60, 30);
        txtNumeroIntermedio.setEditable(false);
        getContentPane().add(txtNumeroIntermedio);

    }

    protected void btnCalcular_actionPerformed(){
       int num1 = Integer.parseInt(txtNumero1.getText());
       int num2 = Integer.parseInt(txtNumero2.getText());
       int num3 = Integer.parseInt(txtNumero3.getText());

       int Intermedio;
       if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
        intermedio = num1;
       } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)){
        intermedio = num2;
       } else {
        intermedio = num3;
       }

       txtNumeroIntermedio.setText(String.valueOf(intermedio));
    } 
}