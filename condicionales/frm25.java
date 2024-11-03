package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm25 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSueldoBruto, txtNumeroHijos, txtBonificacion, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm25 frame = new frm25();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm25() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(30, 30, 100, 30);
        getContentPane().add(lblSueldoBruto);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(150, 30, 100, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSueldoBruto);

        JLabel lblNumeroHijos = new JLabel("Número de Hijos:");
        lblNumeroHijos.setBounds(30, 80, 120, 30);
        getContentPane().add(lblNumeroHijos);

        txtNumeroHijos = new JTextField();
        txtNumeroHijos.setBounds(150, 80, 100, 30);
        txtNumeroHijos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroHijos);

        JButton btnCalcular = new JButton("Calcular Bonificación");
        btnCalcular.setBounds(30, 130, 220, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        JLabel lblBonificacion = new JLabel("Bonificación:");
        lblBonificacion.setBounds(30, 180, 100, 30);
        getContentPane().add(lblBonificacion);

        txtBonificacion = new JTextField();
        txtBonificacion.setBounds(150, 180, 100, 30);
        txtBonificacion.setEditable(false);
        getContentPane().add(txtBonificacion);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(30, 210, 100, 30);
        getContentPane().add(lblSueldoNeto);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(150, 210, 100, 30);
        txtSueldoNeto.setEditable(false);
        getContentPane().add(txtSueldoNeto);
    }

    protected void btnCalcular_actionPerformed() {
        double sueldoBruto = Double.parseDouble(txtSueldoBruto.getText());
        int numeroHijos = Integer.parseInt(txtNumeroHijos.getText());
        double bonificacion;
        double sueldoNeto;

        if (numeroHijos > 1) {
            bonificacion = sueldoBruto * 0.125 + (numeroHijos * 40);
        } else {
            bonificacion = sueldoBruto * 0.10;
        }


        sueldoNeto = sueldoBruto + bonificacion;


        txtBonificacion.setText(String.format("%.2f", bonificacion));
        txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));
    }
}