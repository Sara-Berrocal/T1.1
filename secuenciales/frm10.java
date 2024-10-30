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


public class frm010 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblNumeroReverso;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm10() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblNumero = new JLabel("Numero (4 cifras):");
        lblNumero.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumero);
   
        txtNumero= new JTextField();
        txtNumero.setBounds(200, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Invertir Numero");
        btnCalcular.setBounds(80, 80, 180, 30);
        getContentPane().add(btnCalcular);

        lblNumeroReverso = new JLabel("Numero al reves: ");
        lblNumeroReverso.setBounds(50, 130, 250, 30);
        getContentPane().add(lblNumeroReverso);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
       int numero = Integer.parseInt(txtNumero.getText());

       int unidad = numero % 10;
       numero /= 10;
       int decena = numero % 10;
       numero /= 10;
       int centena = numero % 10;
       numero /= 10;
       int millar = numero;

       int numeroReverso = (unidad * 1000) + (decena * 100) + (centena * 10)+ millar;

       lblNumeroReverso.setText("Numero al reves: " + numeroReverso);
    }    
}