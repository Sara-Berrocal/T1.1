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


public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio,txtAltura;
    JLabel lblAreaTotal, lblVolumen;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm06() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblRadio = new JLabel("Radio (r) :");
        lblRadio.setBounds(30, 30, 80, 30);
        getContentPane().add(lblRadio);

        
        JLabel lblAltura = new JLabel("Altura (h) :");
        lblAltura.setBounds(30, 70, 80, 30);
        getContentPane().add(lblAltura);

        txtRadio = new JTextField();
        txtRadio.setBounds(120, 30, 60, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(120, 70, 60, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 110, 120, 30);
        getContentPane().add(btnCalcular);

        lblAreaTotal = new JLabel("Area Toral: ");
        lblAreaTotal.setBounds(30, 150, 200, 30);
        getContentPane().add(lblAreaTotal);

        lblVolumen = new JLabel("Volumen: ");
        lblVolumen.setBounds(30, 180, 200, 30);
        getContentPane().add(lblVolumen);

        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
        double radio = Double.parseDouble(txtRadio.getText());
        double altura = Double.parseDouble(txtRAltura.getText());

        double areaTotal = 2 * Math.PI * radio * (radio + altura);
        double volumen   = Math.PI * Math.pow(radio, 2) * altura;

        DecimalFormat df = new DecimalFormat("###.00");
        lblAreaTotal.setText("Area Total: " + df.format(areaTotal));
        lblVolumen.setText("Volumen: " + df.format(volumen));
    }
}