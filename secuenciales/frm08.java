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


public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio,txtAltura;
    JLabel lblAreaBase, lblArealateral, lblAreaTotal;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm08() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(50, 50, 80, 30);
        getContentPane().add(lblRadio);
   
        JLabel lblAltura = new JLabel("RAltura:");
        lblAltura.setBounds(50, 90, 80, 30);
        getContentPane().add(lblAltura);

        txtRadio = new JTextField();
        txtRadio.setBounds(140, 50, 60, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(140, 90, 60, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 130, 100, 30);
        getContentPane().add(btnCalcular);

        lblAreaBase = new JLabel("Area Base :");
        lblAreaBase.setBounds(50, 170, 200, 30);
        getContentPane().add(lblAreaBase);

        lblAreaLateral= new JLabel("Area Lateral :");
        lblAreaLateral.setBounds(50, 200, 200, 30);
        getContentPane().add(lblAreaLateral);

        lblAreaTotal = new JLabel("Area Total :");
        lblAreaBase.setBounds(50, 230, 200, 30);
        getContentPane().add(lblAreaBase);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
        double radio = Double.parseDouble(txtRadio.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        double areaBase = calcularAreBase(radio);
        double areaLateral = calcularAreaLateral(radio, altura);
        double areaTotal = calcularAreaTotal(areaBase, areaLateral);

        DecimalFormat df = new DecimalFormat("###.00");
        lblAreaBase.setText("Area Base: " + df.format(areaBase));
        lblAreaLateral.setText("Area Lateral: " + df.format(areaLateral));
        lblAreaTotal.setText("Area Total: " + df.format(areaTotal));
    }
    private double calcularAreaBase(double r) {
        return Math.PI * r * r;
    }
    private double calcularAreLateral(double r, double h) {
        return 2 * Math.PI * r * h;
    }
    private double calcularAreTotal(double areaBase, double areaLateral) {
        return 2 * areaBase + areaLateral;
    }    
}