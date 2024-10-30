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


public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase,txtAltura;
    JLabel lblArea, lblPerimetro;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm07() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 50, 60, 30);
        getContentPane().add(lblBase);

        
        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 90, 60, 30);
        getContentPane().add(lblAltura);

        txtBase = new JTextField();
        txtBase.setBounds(120, 50, 60, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        txtAltura = new JTextField();
        txtAltura.setBounds(120, 90, 60, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 130, 100, 30);
        getContentPane().add(btnCalcular);

        lblArea = new JLabel("Area :");
        lblArea.setBounds(50, 170, 200, 30);
        getContentPane().add(lblArea);

        lblPerimetro = new JLabel("Perimetro: ");
        lblPerimetro.setBounds(50, 200, 200, 30);
        getContentPane()add.(lblPerimetro);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
        double base = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        double area = calcularArea(base,altura);
        double perimetro = calcularPerimetro(base, altura);

        DecimalFormat df = new DecimalFormat("###.00");
        lblArea.setText("Area: " + df.format(area));
        lblPerimetro.setText("Perimetro: " + df.format(perimetro));
    }
    private double calcularArea(double base, double altura) {
        return base * altura;
    }
    private double calcularPerimetro(double base, double altura){
        return2 * (base + altura);
    }
}


