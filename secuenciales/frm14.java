import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm014 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtNumero4, txtNumero5;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm14() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(150, 30, 60, 30);
        getContentPane().add(txtNumero1);

        
        txtNumero2 = new JTextField();
        txtNumero2.setBounds(150, 70, 60, 30);
        getContentPane().add(txtNumero2);

        
        txtNumero3 = new JTextField();
        txtNumero3.setBounds(150, 110, 60, 30);
        getContentPane().add(txtNumero3);

        
        txtNumero4 = new JTextField();
        txtNumero4.setBounds(150, 150, 60, 30);
        getContentPane().add(txtNumero4);

        
        txtNumero5 = new JTextField();
        txtNumero5.setBounds(150, 190, 60, 30);
        getContentPane().add(txtNumero5);

        JButton btnICalcular = new JButton("Calcular Promedio");
        btnCalcular.setBounds(80, 230, 180, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Promedio: ");
        lblResultado.setBounds(50, 260, 250, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPromedio();
            }
        });
    }


    protected void calcularPromedio() {
        
            double num1 = Double.parseDouble(txtNumero1.getText());
            double num2 = Double.parseDouble(txtNumero2.getText());
            double num3 = Double.parseDouble(txtNumero3.getText());
            double num4 = Double.parseDouble(txtNumero4.getText());
            double num5 = Double.parseDouble(txtNumero5.getText());
            
            double mayor1 = Math.max(num1, Math.max(num2, Math.max(num3. Math.max(num4, num5))));
            double menor1 = Math.min(num1, Math.min(num2, Math.min(num3. Math.min(num4, num5))));
            
            double mayor2 = Math.max(Math.max(num1, num2), Math.max(num3, Math.max(num4, num5))) - (mayor1 == num1 ? num1 : 0);
            mayor2 = Math.max(mayor2, Math.max(Math.max(num3, num4), num5));

            double sumaMayores = mayor1 + mayor2 + Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))) - (mayor1 == mayor2 ? mayor2 : 0));
            double promedio = sumaMyores / 3;

            lblResultado.setText("Promedio: " + promedio);        
    }
}
