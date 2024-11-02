package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDocenas, txtMontoCompra, txtDescuento, txtTotalPagar, txtLapiceros;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm17 frame = new frm17();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDocenas = new JLabel("Docenas compradas: ");
        lblDocenas.setBounds(50, 30, 150, 30);
        getContentPane().add(lblDocenas);

        txtDocenas = new JTextField();
        txtDocenas.setBounds(200, 30, 60, 30);
        txtDocenas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDocenas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(50, 80, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblMontoCompra = new Jlabel("Monto de la compra: ");
        lblMontoCompra.setBounds(50, 130, 150, 30);
        getContentPane().add(lblMontoCompra);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(200, 130, 100, 30);
        txtMontoCompra.setEditable(false);
        getContentPane().add(txtMontoCompra);

        Jlabel lblDescuento = new Jlabel("Descuento: ");
        lblDescuento.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 170, 100, 30);
        txtDescuento.setEditable(false);
        getContentPane().add(txtDescuento);

        Jlabel lblTotalPagar = new Jlabel("Total a Pagar: ");
        lblTotalPagar.setBounds(50, 210, 150, 30);
        getContentPane().add(lblTotalPagar);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(200, 210, 100, 30);
        txtTotalPagar.setEditable(false);
        getContentPane().add(txtTotalPagar);

        Jlabel lblLapiceros = new Jlabel("Lapiceros de obsequio: ");
        lblLapiceros.setBounds(50, 250, 150, 30);
        getContentPane().add(lblLapiceros);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(200, 250, 100, 30);
        txtLapiceros.setEditable(false);
        getContentPane().add(txtLapiceros);
    }

    protected void btnCalcular_actionPerformed(){
        int docenas = Integer.parseInt(txtDocenas.getText());
        double precioPorDocena = 20.0;
        double montoCompra = docenas * precioPorDocena;
        double descuento;
        double totalPagar;
        int lapiceros = 0;

        if ( docenas >= 6) {
           descuento = montoCompra * 0.15;
        } else {
           descuento = montoCompra * 0.10;
        }
        totalPagar = montoCompra - descuento;

        if(docenas >= 30){
            lapiceros = (docenas / 3) * 2;
        }

        txtMontoCompra.setText(String.format("%.2f", montoCompra));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotalPagar.setText(String.format("%.2f", totalPagar));
        txtLapiceros.setText(String.format("%.2f", lapiceros));
    }
}