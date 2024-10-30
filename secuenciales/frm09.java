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


public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm09 frame = new frm09();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm09() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblNumero = new JLabel("Numero (4 cifras):");
        lblNumero.setBounds(50, 50, 60, 30);
        getContentPane().add(lblNumero);
   
        txtNumero= new JTextField();
        txtNumero.setBounds(180, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JButton btnSumar = new JButton("Sumar Cifras");
        btnSumar.setBounds(80, 100, 130, 30);
        getContentPane().add(btnSumar);

        lblResultado = new JLabel("Suma de cifras: ");
        lblResultado.setBounds(50, 140, 200, 30);
        getContentPane().add(lblResultado);

        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnSumar_actionPerformed() {
       int numero = Integer.parseInt(txtNumero.getText());

       int sumaCifras = (numero % 10) + 
                        ((numero / 10)%10)+
                        ((numero / 100) % 10)+
                        (numero / 10000);
       
       lblResultado.setText("Suma de cifras: " + sumaCifras);
    }    
}