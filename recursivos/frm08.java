import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
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
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero:");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero); 
        
        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JButton btnFactores = new JButton("Factores Primos");
        btnFactores.setBounds(80, 80, 200, 30);
        getContentPane().add(btnFactores);

        lblResultado = new JLabel("Factores: ");
        lblResultado.setBounds(50, 120, 250, 30);
        getContentPane().add(lblResultado);

        btnFactores.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnFactores_actionPerformed();
            }
        });
    }
    
    protected void btnFactores_actionPerformed(){
        int n = Integer.parseInt(txtNumero.getText());
        String resultado = factoresPrimos(n, 2);
        lblResultado.setText("Factores: " + resultado);    
    }

    private String factoresPrimos(int n, int divisor) {
        if (n == 1) {
            return "";
        } 
        if (n % divisor == 0){
            return divisor + " " + factoresPrimos(n / divisor, divisor);
        }
        return factoresPrimos(n, divisor + 1);
    }
}
