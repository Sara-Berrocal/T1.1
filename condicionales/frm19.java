package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSexo, txtEdad, txtCategoria;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSexo = new JLabel("Sexo (F/M): ");
        lblSexo.setBounds(50, 30, 100, 30);
        getContentPane().add(lblSexo);

        txtSexo = new JTextField();
        txtSexo.setBounds(150, 30, 60, 30);
        txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSexo);

        JLabel lblEdad = new JLabel("Edad: ");
        lblEdad.setBounds(50, 70, 100, 30);
        getContentPane().add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(150, 70, 60, 30);
        txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEdad);

        JButton btnCalcular = new JButton("Determinar Categoria");
        btnCalcular.setBounds(50, 110, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblCategoria = new Jlabel("Categoria: ");
        lblCategoria.setBounds(50, 150, 100, 30);
        getContentPane().add(lblCategoria);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(150, 150, 100, 30);
        txtCategoria.setEditable(false);
        getContentPane().add(txtCategoria);
    }
    protected void btnCalcular_actionPerformed(){
        String sexo = txtSexo.getText().toUpperCase();
        int edad = integer.parseInt(txtEdad.getText());
        String categoria;

        if ( sexo.equals ("F")){
            categoria = (edad < 23) ? "FA" : "FB";
        } else if (sexo.equals("M")) {
            categoria = (edad < 25) ? "MA" : "MB";
        } else {
            categoria = "Sexo no valido";
        }
        txtCategoria.setText(categoria);
    }
}