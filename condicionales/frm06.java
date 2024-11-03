package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtEdad1, txtEdad2, txtEdad3, txtEdadMenor, txtEdadMayor;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblEdad1= new JLabel("Edad 1: ");
        lblEdad1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblEdad1);

        txtEdad1 = new JTextField();
        txtEdad1.setBounds(150, 30, 60, 30);
        txtEdad1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad1);

        JLabel lblEdad2= new JLabel("Edad 2: ");
        lblEdad1.setBounds(50, 80, 80, 30);
        getContentPane().add(lblEdad2);

        txtEdad2 = new JTextField();
        txtEdad2.setBounds(150, 80, 60, 30);
        txtEdad2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad2);

        JLabel lblEdad3= new JLabel("Edad 3: ");
        lblEdad3.setBounds(50, 130, 80, 30);
        getContentPane().add(lblEdad3);

        txtEdad3 = new JTextField();
        txtEdad3.setBounds(150, 130, 60, 30);
        txtEdad3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEdad3);


        JButton btnCalcular = new JButton("Calcular Edades");
        btnCalcular.setBounds(80, 180, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblEdadMenor = new Jlabel("Edad Menor: ");
        lblEdadMenor.setBounds(50, 230, 100, 30);
        getContentPane().add(lblEdadMenor);

        txtEdadMenor = new JTextField();
        txtEdadMenor.setBounds(150, 230, 60, 30);
        txtEdadMenor.setEditable(false);
        getContentPane().add(txtEdadMenor);

        Jlabel lblEdadMayor = new Jlabel("Edad Mayor: ");
        lblEdadMayor.setBounds(220, 230, 100, 30);
        getContentPane().add(lblEdadMayor);

        txtEdadMayor = new JTextField();
        txtEdadMayor.setBounds(300, 230, 60, 30);
        txtEdadMayor.setEditable(false);
        getContentPane().add(txtEdadMayor);
    }

    protected void btnCalcular_actionPerformed(){
       int edad1 = Integer.parseInt(txtEdad1.getText());
       int edad2 = Integer.parseInt(txtEdad2.getText());
       int edad3 = Integer.parseInt(txtEdad3.getText());

       int edadMenor = Math.min(edad1, Math.min(edad2, edad3));
       int edadMayor = Math.max(edad1, Math.min(edad2, edad3));

       txtEdadMenor.setText(String.valueOf(edadMenor));
       txtEdadMayor.setText(String.valueOf(edadMayor));
    } 
}