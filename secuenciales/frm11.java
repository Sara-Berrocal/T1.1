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


public class frm011 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2;
    JLabel lblResultado1, lblResultado2;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm11 frame = new frm11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm11() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblNumero1 = new JLabel("Numero 1 (3 cifras):");
        lblNumero1.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumero1);
   
        txtNumero1= new JTextField();
        txtNumero1.setBounds(200, 30, 60, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        JLabel lblNumero2 = new JLabel("Numero 2 (3 cifras):");
        lblNumero2.setBounds(50, 80, 150, 30);
        getContentPane().add(lblNumero2);
   
        txtNumero2= new JTextField();
        txtNumero2.setBounds(200, 80, 60, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        JButton btnIntercambiar = new JButton("Intercambiar");
        btnIntercambiar.setBounds(80, 130, 130, 30);
        getContentPane().add(btnIntercambiar);

        lblNumero1 = new JLabel("Numero 1: ");
        lblResultado1.setBounds(50, 170, 200, 30);
        getContentPane().add(lblResultado1);

        lblNumero2 = new JLabel("Numero 2: ");
        lblResultado2.setBounds(50, 200, 200, 30);
        getContentPane().add(lblResultado2);

        btnIntercambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnIntercambiar_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
       int numero1 = Integer.parseInt(txtNumero1.getText());
       int numero2 = Integer.parseInt(txtNumero2.getText());
       
       int nuevaCifra1 = (numero2 / 100) * 100 + (numero1 % 100);
       int nuevaCifra2 = (numero1 / 100) * 100 + (numero2 % 100);

       lblResultado1.setText("Numero 1: " + nuevaCifra1);
       lblResultado2.setText("Numero 2: " + nuevaCifra2);
    }    
}