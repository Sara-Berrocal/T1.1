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


public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido;
    JLabel lblComision, lblSueldoBruto, lblDescuento, lblSueldoNeto:

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });
    }


    public frm19() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto vendido: ");
        lblMontoVendido.setBounds(50, 30, 100, 30);
        getContentPane().add(lblMontoVendido);

        txtMontoVendido new JTextField();
        txtMontoVendido.setBounds(150, 30, 100, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoVendido);

        JButton btnCalcular = new JButton("Calcular Sueldo");
        btnCalcular.setBounds(80, 80, 180, 30);
        getContentPane().add(btnCalcular);

        lblComision = new JLabel("Comision: ");
        lblComision.setBounds(50, 130, 250, 30);
        getContentPane().add(lblComision);

        lblSueldoBruto = new JLabel("Sueldo Bruto: ");
        lblSueldoBruto.setBounds(50, 160, 250, 30);
        getContentPane().add(lblSueldoBruto);

        lblDescuento = new JLabel("Descuento: ");
        lblDescuento.setBounds(50, 190, 250, 30);
        getContentPane().add(lblDescuento);

        lblSueldoNeto = new JLabel("Sueldo Neto: ");
        lblSueldoNeto.setBounds(50, 220, 250, 30);
        getContentPane().add(lblSueldoNeto);
    

        btnCalcular.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try{
            double montoVendido = Double.parseDouble(txtMontoVendido.getText());
            final double sueldoBasico = 500.00;

            double comision  = montoVendido * 0.09;
            double sueldoBruto = sueldoBasico + comision;
            double descuento = sueldoBruto * 0.11;
            double sueldoNeto = sueldoBruto - descuento;

            DecimalFormat df = new DecimalFormat("###.00");
            lblIComision.setText("Comision: " + df.format(Comision));
            lblSueldoBruto.setText("Sueldo Bruto: " + df.format(sueldoBruto));
            lblDescuento.setText("Descuento: " + df.format(descuento));
            lblSueldoNeto.setText("Sueldo Neto: " + df.format(sueldoNeto));
        
        } cath (NumberFormatException e) {
            lblComision.setText("Ingrese un monto vendido valido: ");
            lblSueldoBruto.setText("");
            lblDescuento.setText("");
            lblSueldoNeto.setText("");
        }
    }
}