package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm30 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCuota, txtDiaPago, txtTotal;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm30 frame = new frm30();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm30() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuota= new JLabel("Cuota Mensual: ");
        lblCuota.setBounds(30, 30, 120, 30);
        getContentPane().add(lblCuota);

        txtCuota = new JTextField();
        txtCuota.setBounds(150, 30, 100, 30);
        txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCuota);

        JLabel lblDiaPago= new JLabel("Dia de Pago: ");
        lblDiaPago.setBounds(30, 80, 120, 30);
        getContentPane().add(lblDiaPago);

        txtDiaPago = new JTextField();
        txtDiaPago.setBounds(150, 80, 100, 30);
        txtDiaPago.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDiaPago);

        JButton btnCalcular = new JButton("Calcular Total ");
        btnCalcular.setBounds(30, 130, 220, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblTotal = new Jlabel("Total a Pagar: ");
        lblTotal.setBounds(30, 180, 120, 30);
        getContentPane().add(lblTotal);

        txtTotal = new JTextField();
        txtTotal.setBounds(150, 180, 100, 30);
        txtTotal.setEditable(false);
        getContentPane().add(txtTotal);

    }

    protected void btnCalcular_actionPerformed(){

        double cuota = Double.parseDouble(txtCuota.getText());
        int diaPago = Integer.parseInt(txtDiaPago.getText());
        double descuento = Math.max(5, cuota * 0.02);

        if (diaPago >= 1 && diaPago <= 10){
            double descuento = Math.max(5, cuota * 0.02);
            total = cuota - descuento;
        } else if (diaPago > 10 && diaPago <= 20){
             total = cuota;
        } else {
            double recargo = Math.max(10, cuota * 0.03);
            total = cuota + recargo;  
        }

        txtTotal.setText(String.format("%.2f", total));
    } 
}