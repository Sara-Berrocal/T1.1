package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtImporte, txtDescuento, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm01 frame = new frm01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad de unidades: ");
        lblCantidad.setBounds(50, 50, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(200, 50, 60, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 100, 150, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblImporte = new Jlabel("Importe de la compra: ");
        lblImporte.setBounds(50, 150, 150, 30);
        getContentPane().add(lblImporte);

        txtImporte = new JTextField();
        txtImporte.setBounds(200, 150, 100, 30);
        txtImporte.setEditable(false);
        getContentPane().add(txtImporte);

        Jlabel lblDescuento= new Jlabel("Descuento: ");
        lblDescuento.setBounds(50, 190, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 290, 100, 30);
        txtDescuento.setEditable(false);
        getContentPane().add(txtDescuento);
        
        Jlabel lblTotal= new Jlabel("Total a pagar: ");
        lblTotal.setBounds(50, 230, 150, 30);
        getContentPane().add(lblTotal);

        txtTotal = new JTextField();
        txtTotal.setBounds(200, 230, 100, 30);
        txtTotal.setEditable(false);
        getContentPane().add(txtTotal);
    }

    protected void btnCalcular_actionPerformed(){
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioUnitario;

        if (cantidad >= 1 && cantidad <= 25) {
           precioUnitario = 27.0;
        } else if (cantidad >= 26 && cantidad <= 50){
            precioUnitario = 25.0;
        } else if (cantidad > 50){
            precioUnitario = 23.0;
        } else {
            txtImporte.setText("Cantidad no valida.");
            txtDescuento.setText("");
            txtTotal.setText("");
            return;
        }

        double importeCompra = cantidad * precioUnitario;
        double descuento = cantidad > 50 ? 0.15 * importeCompra : 0.05 * importeCompra;
        double totalApagar = importeCompra - descuento;

        txtImporte.setText(String.format("S/. %2f", importeCompra));
        txtDescuento.setText(String.format("S/. %2f", descuento));
        txtTotal.setText(String.format("S/. %2f", totalApagar));
    } 
}