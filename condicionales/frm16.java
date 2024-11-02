package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtIngresoMensual, txtCostoCasa, txtCuotaInicial, txtCuotaMensual;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm16 frame = new frm16();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIngresoMensual = new JLabel("Ingreso Mensual: ");
        lblIngresoMensual.setBounds(50, 30, 130, 30);
        getContentPane().add(lblIngresoMensual);

        txtIngresoMensual = new JTextField();
        txtIngresoMensual.setBounds(180, 30, 100, 30);
        txtIngresoMensual.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtIngresoMensual);

        JLabel lblCostoCasa = new JLabel("Costo de la casa: ");
        lblCostoCasa.setBounds(50, 80, 130, 30);
        getContentPane().add(lblCostoCasa);

        txtCostoCasa = new JTextField();
        txtCostoCasa.setBounds(180, 80, 100, 30);
        txtCostoCasa.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCostoCasa);

        JButton btnCalcular = new JButton("Calcular cuotas");
        btnCalcular.setBounds(50, 130, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblCuotaInial = new Jlabel("Cuota inicial: ");
        lblCuotaInial.setBounds(50, 180, 100, 30);
        getContentPane().add(lblCuotaInial);

        txtCuotaInicial = new JTextField();
        txtCuotaInicial.setBounds(150, 180, 100, 30);
        txtCuotaInicial.setEditable(false);
        getContentPane().add(txtCuotaInicial);

        Jlabel lblCuotaMensual = new Jlabel("Cuota Mensual: ");
        lblCuotaMensual.setBounds(50, 210, 100, 30);
        getContentPane().add(lblCuotaMensual);

        txtCuotaMensual = new JTextField();
        txtCuotaMensual.setBounds(150, 210, 100, 30);
        txtCuotaMensual.setEditable(false);
        getContentPane().add(txtCuotaMensual);

    }

    protected void btnCalcular_actionPerformed(){
        double ingresoMensual = Double.parseDouble(txtIngresoMensual.getText());
        double costoCasa = Double.parseDouble(txtCostoCasa.getText());
        double cuotaInicial;
        double cuotaMensual;

        if (ingresoMensual < 1250) {
           cuotaInicial = costoCasa * 0.15;
           cuotaMensual = (costoCasa - cuotaInicial) / 120;
        } else {
            cuotaInicial = costoCasa * 0.30;
            cuotaMensual = (costoCasa - cuotaInicial) / 75;
        }

        txtCuotaInicial.setText(String.format("%.2f", cuotaInicial));
        txtCuotaMensual.setText(String.format("%.2f", cuotaMensual));
    }
}