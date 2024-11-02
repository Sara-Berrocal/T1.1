package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNota1, txtNota2, txtNota3, txtPromedioFinal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNota1 = new JLabel("Nota1: ");
        lblNota1.setBounds(50, 50, 80, 30);
        getContentPane().add(lblNota1);

        txtNota1 = new JTextField();
        txtNota1.setBounds(150, 50, 60, 30);
        txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota1);

        JLabel lblNota2 = new JLabel("Nota2: ");
        lblNota2.setBounds(50, 100, 80, 30);
        getContentPane().add(lblNota2);

        txtNota2 = new JTextField();
        txtNota2.setBounds(150, 100, 60, 30);
        txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota2);

        JLabel lblNota3 = new JLabel("Nota3: ");
        lblNota3.setBounds(50, 150, 80, 30);
        getContentPane().add(lblNota3);

        txtNota3 = new JTextField();
        txtNota3.setBounds(150, 150, 60, 30);
        txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNota3);

        JButton btnCalcular = new JButton("Calcular Promedio");
        btnCalcular.setBounds(80, 200, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblPromedioFinal = new Jlabel("Promedio Final: ");
        lblPromedioFinal.setBounds(50, 240, 100, 30);
        getContentPane().add(lblPromedioFinal);

        txtPromedioFinal = new JTextField();
        txtPromedioFinal.setBounds(150, 240, 60, 30);
        txtPromedioFinal.setEditable(false);
        getContentPane().add(txtPromedioFinal);

    }

    protected void btnCalcular_actionPerformed(){
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());
        double nota3 = Double.parseDouble(txtNota3.getText());

        if (nota1 >= 10){
            nota3 += 2;
        }
        double promedioFInal = (nota1 + nota2 +nota3) / 3;

        txtPromedioFinal.setText(String.format("%.2f", promedioFInal));
    } 
}