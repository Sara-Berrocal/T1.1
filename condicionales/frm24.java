package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm24 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido, txtSueldo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm24 frame = new frm24();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm24() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto Vendido:");
        lblMontoVendido.setBounds(30, 30, 120, 30);
        getContentPane().add(lblMontoVendido);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(150, 30, 100, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMontoVendido);

        JButton btnCalcular = new JButton("Calcular Sueldo");
        btnCalcular.setBounds(30, 80, 220, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        JLabel lblSueldo = new JLabel("Sueldo:");
        lblSueldo.setBounds(30, 130, 100, 30);
        getContentPane().add(lblSueldo);

        txtSueldo = new JTextField();
        txtSueldo.setBounds(150, 130, 100, 30);
        txtSueldo.setEditable(false);
        getContentPane().add(txtSueldo);
    }

    protected void btnCalcular_actionPerformed() {
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double sueldoBase = montoVendido * 0.10;
        double sueldoExtra = 0.0;

     
        if (montoVendido > 5000) {
            double exceso = montoVendido - 5000;
            sueldoExtra = (exceso / 500) * 25;
        }

        double sueldoTotal = sueldoBase + sueldoExtra;


        txtSueldo.setText(String.format("%.2f", sueldoTotal));
    }
}