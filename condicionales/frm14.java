package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroTarjeta, txtMontoCompra, txtDescuento;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroTarjeta= new JLabel("N° Tarjeta: ");
        lblNumeroTarjeta.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumeroTarjeta);

        txtNumeroTarjeta = new JTextField();
        txtNumeroTarjeta.setBounds(150, 30, 100, 30);
        txtNumeroTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroTarjeta);

        JLabel lblMontoCompra= new JLabel("Monto Compra: ");
        lblMontoCompra.setBounds(50, 80, 100, 30);
        getContentPane().add(lblMontoCompra);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(150, 80, 100, 30);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMontoCompra);

        JButton btnCalcular = new JButton("Calcular Descuento ");
        btnCalcular.setBounds(50, 130, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblDescuento = new Jlabel("Descuento: ");
        lblDescuento.setBounds(50, 180, 100, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(150, 180, 100, 30);
        txtDescuento.setEditable(false);
        getContentPane().add(txtDescuento);

    }

    protected void btnCalcular_actionPerformed(){

        int numeroTarjeta = Integer.parseInt(txtNumeroTarjeta.getText());
        double montoCompra = Double.parseDouble(txtMontoCompra.getText());
        double descuento;
    

        if (numeroTarjeta >= 100 %% numeroTarjeta % 2 == 0) {
            descuento = montoCompra * 0.15;
            
        } else {
            descuento = montoCompra * 0.05;
        }
        txtDescuento.setText(String.format("%.2f", descuento));
    }
}

