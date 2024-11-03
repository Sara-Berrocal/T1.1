package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm22 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidadesA, txtUnidadesB, txtImporteBruto, txtDescuento, txtTotalAPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm22 frame = new frm22();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm22() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidadesA = new JLabel("Unidades Producto A:");
        lblUnidadesA.setBounds(50, 30, 150, 30);
        getContentPane().add(lblUnidadesA);

        txtUnidadesA = new JTextField();
        txtUnidadesA.setBounds(200, 30, 100, 30);
        txtUnidadesA.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtUnidadesA);

        JLabel lblUnidadesB = new JLabel("Unidades Producto B:");
        lblUnidadesB.setBounds(50, 80, 150, 30);
        getContentPane().add(lblUnidadesB);

        txtUnidadesB = new JTextField();
        txtUnidadesB.setBounds(200, 80, 100, 30);
        txtUnidadesB.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtUnidadesB);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(50, 130, 250, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        JLabel lblImporteBruto = new JLabel("Importe Bruto:");
        lblImporteBruto.setBounds(50, 180, 100, 30);
        getContentPane().add(lblImporteBruto);

        txtImporteBruto = new JTextField();
        txtImporteBruto.setBounds(150, 180, 150, 30);
        txtImporteBruto.setEditable(false);
        getContentPane().add(txtImporteBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 220, 100, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(150, 220, 150, 30);
        txtDescuento.setEditable(false);
        getContentPane().add(txtDescuento);

        JLabel lblTotalAPagar = new JLabel("Total a Pagar:");
        lblTotalAPagar.setBounds(50, 260, 100, 30);
        getContentPane().add(lblTotalAPagar);

        txtTotalAPagar = new JTextField();
        txtTotalAPagar.setBounds(150, 260, 150, 30);
        txtTotalAPagar.setEditable(false);
        getContentPane().add(txtTotalAPagar);
    }

    protected void btnCalcular_actionPerformed() {
        int unidadesA = Integer.parseInt(txtUnidadesA.getText());
        int unidadesB = Integer.parseInt(txtUnidadesB.getText());
        double precioA = 25.0;
        double precioB = 30.0;

        double importeBruto = (unidadesA * precioA) + (unidadesB * precioB);

       
        double descuento = 0.0;
        if (unidadesA > 50) {
            descuento += importeBruto * 0.15;
        } else if (unidadesB > 60) {
            descuento += importeBruto * 0.10;
        }

        double totalAPagar = importeBruto - descuento;


        txtImporteBruto.setText(String.format("%.2f", importeBruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotalAPagar.setText(String.format("%.2f", totalAPagar));
    }
}