package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNota1, txtNota2, txtNota3, txtNota4, txtNota5;
    JTextField txtNotaMenor, txtNotaMayor, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNota1= new JLabel("Nota 1: ");
        lblNota1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblNota1);

        txtNota1 = new JTextField();
        txtNota1.setBounds(150, 30, 60, 30);
        txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota1);

        JLabel lblNota2= new JLabel("Nota 2: ");
        lblNota2.setBounds(50, 70, 80, 30);
        getContentPane().add(lblNota2);

        txtNota2 = new JTextField();
        txtNota2.setBounds(150, 70, 60, 30);
        txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota2);

        JLabel lblNota3= new JLabel("Nota 3: ");
        lblNota3.setBounds(50, 110, 80, 30);
        getContentPane().add(lblNota3);

        txtNota3 = new JTextField();
        txtNota3.setBounds(150, 110, 60, 30);
        txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota3);

        JLabel lblNota4= new JLabel("Nota 4: ");
        lblNota4.setBounds(50, 150, 80, 30);
        getContentPane().add(lblNota4);

        txtNota4 = new JTextField();
        txtNota4.setBounds(150, 150, 60, 30);
        txtNota4.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota4);

        JLabel lblNota5= new JLabel("Nota 5: ");
        lblNota5.setBounds(50, 190, 80, 30);
        getContentPane().add(lblNota5);

        txtNota5 = new JTextField();
        txtNota5.setBounds(150, 190, 60, 30);
        txtNota5.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota5);


        JButton btnCalcular = new JButton("Calcular Promedio: ");
        btnCalcular.setBounds(80, 230, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblNotaMenor = new Jlabel("Nota Menor: ");
        lblNotaMenor.setBounds(220, 30, 100, 30);
        getContentPane().add(lblNotaMenor);

        txtNotaMenor = new JTextField();
        txtNotaMenor.setBounds(300, 30, 60, 30);
        txtNotaMenor.setEditable(false);
        getContentPane().add(txtNotaMenor);

        Jlabel lblNotaMayor = new Jlabel("Nota Mayor: ");
        lblNotaMayor.setBounds(220, 70, 100, 30);
        getContentPane().add(lblNotaMayor);

        txtNotaMayor = new JTextField();
        txtNotaMayor.setBounds(300, 70, 60, 30);
        txtNotaMayor.setEditable(false);
        getContentPane().add(txtNotaMayor);

        Jlabel lblPromedio = new Jlabel("Promedio: ");
        lblPromedio.setBounds(220, 110, 100, 30);
        getContentPane().add(lblPromedio);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(300, 110, 60, 30);
        txtPromedio.setEditable(false);
        getContentPane().add(txtPromedio);
    }

    protected void btnCalcular_actionPerformed(){

       double nota1 = Double.parseDouble(txtNota1.getText());
       double nota2 = Double.parseDouble(txtNota2.getText());
       double nota3 = Double.parseDouble(txtNota3.getText());
       double nota4 = Double.parseDouble(txtNota4.getText());
       double nota5 = Double.parseDouble(txtNota5.getText());
       
       double notaMenor = Math.min(Math.min(nota1, nota2), Math.min(nota3, Math.min(nota4, nota5)));
       double notaMayor = Math.max(Math.max(nota1, nota2), Math.max(nota3, Math.max(nota4, nota5)));
       
    
       double promedio = (nota1 + nota2 + nota3 + nota4 + nota5 - notaMenor - notaMayor) / 3;

       txtNotaMenor.setText(String.valueOf(notaMenor));
       txtNotaMayor.setText(String.valueOf(notaMayor));
       txtPromedio.setText(String.valueOf(promedio));
    } 
}