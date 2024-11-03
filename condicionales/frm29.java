package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm29 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtPagoPorHora, txtSueldoBruto, txtDescuento, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm29 frame = new frm29();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm29() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(30, 30, 150, 30);
        getContentPane().add(lblHorasTrabajadas);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(180, 30, 100, 30);
        txtHorasTrabajadas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtHorasTrabajadas);

        JLabel lblPagoPorHora = new JLabel("Pago por Hora:");
        lblPagoPorHora.setBounds(30, 80, 150, 30);
        getContentPane().add(lblPagoPorHora);

        txtPagoPorHora = new JTextField();
        txtPagoPorHora.setBounds(180, 80, 100, 30);
        txtPagoPorHora.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPagoPorHora);

        JButton btnCalcular = new JButton("Calcular Sueldo");
        btnCalcular.setBounds(30, 130, 250, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(30, 180, 150, 30);
        getContentPane().add(lblSueldoBruto);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(180, 180, 100, 30);
        txtSueldoBruto.setEditable(false);
        getContentPane().add(txtSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 220, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 220, 100, 30);
        txtDescuento.setEditable(false);
        getContentPane().add(txtDescuento);

        JLabel lblTotal = new JLabel("Total a Pagar:");
        lblTotal.setBounds(30, 260, 150, 30);
        getContentPane().add(lblTotal);

        txtTotal = new JTextField();
        txtTotal.setBounds(180, 260, 100, 30);
        txtTotal.setEditable(false);
        getContentPane().add(txtTotal);
    }

    protected void btnCalcular_actionPerformed() {
        int horas = Integer.parseInt(txtHorasTrabajadas.getText());
        double pagoPorHora = Double.parseDouble(txtPagoPorHora.getText());
        double sueldoBruto;
        double descuento = 0;
        double total;

        if (horas <= 48) {
            sueldoBruto = horas * pagoPorHora;
        } else {
            int horasExtras = horas - 48;
            sueldoBruto = (48 * pagoPorHora) + (horasExtras * pagoPorHora * 1.2);
        }

        if (sueldoBruto > 1500) {
            descuento = sueldoBruto * 0.11;
        }

        total = sueldoBruto - descuento;

        txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotal.setText(String.format("%.2f", total));
    }
}
