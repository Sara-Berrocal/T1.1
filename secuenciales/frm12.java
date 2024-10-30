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


public class frm012 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtA, txtB, txtC;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm12 frame = new frm12();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm12() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblA = new JLabel("Coeficiente a):");
        lblA.setBounds(50, 30, 120, 30);
        getContentPane().add(lblA);
   
        txtA = new JTextField();
        txtA.setBounds(180, 30, 60, 30);
        txtA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtA);

        JLabel lblB = new JLabel("Coeficiente b): ");
        lblB.setBounds(50, 80, 120, 30);
        getContentPane().add(lblB);
   
        txtB = new JTextField();
        txtB.setBounds(180, 80, 60, 30);
        txtB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtB);

        JLabel lblC = new JLabel("Coeficiente c): ");
        lblC.setBounds(50, 130, 120, 30);
        getContentPane().add(lblC);
   
        txtB = new JTextField();
        txtB.setBounds(180, 130, 60, 30);
        txtB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtB);

        JButton btnICalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 180, 130, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 220, 200, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
    double a = Double.parseDouble(txtA.getText());
    double b = Double.parseDouble(txtB.getText());
    double c = Double.parseDouble(txtC.getText());

    double discriminante = b * b - 4 * a * c;

    double raiz1 = (-b + Math.sqrt(Math.max(discriminante, 0))) / (2 * a);
    double raiz2 = (-b - Math.sqrt(Math.max(discriminante, 0))) / (2 * a);

    lblResultado.setText(discriminante < 0? "No hay raices reales": "Raices: " + raiz1+ "y" + raiz2);
    }    

}