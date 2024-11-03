package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm23 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNotaMatematicas, txtNotaFisica, txtPropina, txtReloj;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm23 frame = new frm23();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm23() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNotaMatematicas = new JLabel("Nota Matemáticas:");
        lblNotaMatematicas.setBounds(30, 30, 130, 30);
        getContentPane().add(lblNotaMatematicas);

        txtNotaMatematicas = new JTextField();
        txtNotaMatematicas.setBounds(180, 30, 60, 30);
        txtNotaMatematicas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNotaMatematicas);

        JLabel lblNotaFisica = new JLabel("Nota Física:");
        lblNotaFisica.setBounds(30, 80, 130, 30);
        getContentPane().add(lblNotaFisica);

        txtNotaFisica = new JTextField();
        txtNotaFisica.setBounds(180, 80, 60, 30);
        txtNotaFisica.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNotaFisica);

        JButton btnCalcular = new JButton("Calcular Propina");
        btnCalcular.setBounds(30, 130, 250, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        JLabel lblPropina = new JLabel("Propina:");
        lblPropina.setBounds(30, 180, 100, 30);
        getContentPane().add(lblPropina);

        txtPropina = new JTextField();
        txtPropina.setBounds(100, 180, 100, 30);
        txtPropina.setEditable(false);
        getContentPane().add(txtPropina);

        JLabel lblReloj = new JLabel("Reloj:");
        lblReloj.setBounds(30, 210, 100, 30);
        getContentPane().add(lblReloj);

        txtReloj = new JTextField();
        txtReloj.setBounds(100, 210, 100, 30);
        txtReloj.setEditable(false);
        getContentPane().add(txtReloj);
    }

    protected void btnCalcular_actionPerformed() {
        int notaMatematicas = Integer.parseInt(txtNotaMatematicas.getText());
        int notaFisica = Integer.parseInt(txtNotaFisica.getText());
        double propinaMatematicas, propinaFisica, totalPropina;

        
        if (notaMatematicas > 17) {
            propinaMatematicas = 3;
        } else {
            propinaMatematicas = notaMatematicas * 1;
        }

        if (notaFisica > 15) {
            propinaFisica = 2;
        } else {
            propinaFisica = 0.5;
        }

        totalPropina = propinaMatematicas + propinaFisica;

       
        String reloj = (notaMatematicas + notaFisica) / 2.0 > 16 ? "Sí" : "No";

        txtPropina.setText(String.format("%.2f", totalPropina));
        txtReloj.setText(reloj);
    }
}