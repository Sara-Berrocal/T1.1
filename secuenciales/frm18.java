import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtPrecioUnitario;
    JLabel lblImporteCompra, lblDescuento, lblImporteApagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                try {
                    frm18 frame = new frm18();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });
    }


    public frm18() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad: ");
        lblCantidad.setBounds(50, 30, 60, 30);
        getContentPane().add(lblCantidad);

        txtCantidad new JTextField();
        txtCantidad.setBounds(150, 30, 60, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario: ");
        lblPrecioUnitario.setBounds(50, 80, 100, 30);
        getContentPane().add(lblPrecioUnitario);

        txtPrecioUnitario new JTextField();
        txtPrecioUnitario.setBounds(150, 80, 60, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioUnitario.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioUnitario);


        JButton btnCalcular = new JButton("Calcular Importe");
        btnCalcular.setBounds(80, 130, 180, 30);
        getContentPane().add(btnCalcular);

        lblImporteCompra = new JLabel("Importe de la compra: ");
        lblImporteCompra.setBounds(50, 180, 250, 30);
        getContentPane().add(lblImporteCompra);

        lblDescuento = new JLabel("Descuento: ");
        lblDescuento.setBounds(50, 210, 250, 30);
        getContentPane().add(lblDescuento);

        lblImporteApagar = new JLabel("Importe a pagar ");
        lblImporteApagar.setBounds(50, 240, 250, 30);
        getContentPane().add(lblImporteApagar);
    

        btnCalcular.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try{
            int cantidad = Integer.parseInt(txtCantidad.getText());
            double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText);
            
            double impporteCompra  = cantidad * precioUnitario;
            double primerDescuento = importeCompra * 0.15;
            double importeTrasPrimerDescuento = importeCompra - importeTrasPrimerDescuento;
            double descuentoTotal = primerDescuento + segundoDescuento;

            DecimalFormat df = new DecimalFormat("###.00");
            lblImporteCompra.setText("Importe de la compra: " + df.format(importeCompra));
            lblDescuento.setText("Descuento: " + df.format(descuentoTotal));
            lblImporteApagar.setText("Importe a pagar: " + df.format(importeApagar));
        
        } cath (NumberFormatException e) {
            lblImporteCompra.setText("Ingrese valores valido: ");
            lblDescuento.setText("");
            lblImporteApagar.setText("");
        }
    }
}