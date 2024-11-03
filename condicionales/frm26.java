package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm26 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoCompra, txtPropioDinero, txtPrestamo, txtTotalAPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm26 frame = new frm26();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm26() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoCompra = new JLabel("Monto Total de Compra:");
        lblMontoCompra.setBounds(30, 30, 150, 30);
        getContentPane().add(lblMontoCompra);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(180, 30, 100, 30);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMontoCompra);

        JButton btnCalcular = new JButton("Calcular Pago");
        btnCalcular.setBounds(30, 80, 220, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        JLabel lblPropioDinero = new JLabel("Dinero Propio:");
        lblPropioDinero.setBounds(30, 130, 100, 30);
        getContentPane().add(lblPropioDinero);

        txtPropioDinero = new JTextField();
        txtPropioDinero.setBounds(150, 130, 100, 30);
        txtPropioDinero.setEditable(false);
        getContentPane().add(txtPropioDinero);

        JLabel lblPrestamo = new JLabel("Monto del Préstamo:");
        lblPrestamo.setBounds(30, 160, 130, 30);
        getContentPane().add(lblPrestamo);

        txtPrestamo = new JTextField();
        txtPrestamo.setBounds(150, 160, 100, 30);
        txtPrestamo.setEditable(false);
        getContentPane().add(txtPrestamo);

        JLabel lblTotalAPagar = new JLabel("Total a Pagar (con Interés):");
        lblTotalAPagar.setBounds(30, 190, 180, 30);
        getContentPane().add(lblTotalAPagar);

        txtTotalAPagar = new JTextField();
        txtTotalAPagar.setBounds(210, 190, 100, 30);
        txtTotalAPagar.setEditable(false);
        getContentPane().add(txtTotalAPagar);
    }

    protected void btnCalcular_actionPerformed() {
        double montoCompra = Double.parseDouble(txtMontoCompra.getText());
        double porcentajePrestamo;
        double prestamo;
        double dineroPropio;
        double totalAPagar;


        if (montoCompra > 5000) {
            porcentajePrestamo = 0.30;
        } else {
            porcentajePrestamo = 0.20;
        }

        prestamo = montoCompra * porcentajePrestamo;
        dineroPropio = montoCompra - prestamo;

        totalAPagar = prestamo * 1.10;  

        txtPropioDinero.setText(String.format("%.2f", dineroPropio));
        txtPrestamo.setText(String.format("%.2f", prestamo));
        txtTotalAPagar.setText(String.format("%.2f", totalAPagar));
    }
}