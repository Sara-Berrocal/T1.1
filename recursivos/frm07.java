import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
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
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero:");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero); 
        
        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JButton btnContar = new JButton("Contar Ceros");
        btnContar.setBounds(80, 80, 200, 30);
        getContentPane().add(btnContar);

        lblResultado = new JLabel("Ceros: ");
        lblResultado.setBounds(50, 120, 200, 30);
        getContentPane().add(lblResultado);

        btnContar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnContar_actionPerformed();
            }
        });
    }
    
    protected void btnContar_actionPerformed(){
        long n = Long.parseLong(txtNumero.getText());
        lblResultado.setText("Ceros: " + contarCeros(n));    
    }

    private int contarCeros(long n) {
        if (n == 0) {
            return 1;
        } 
            return contarCerosRec(n);
        }
    private int contarCerosRec(long n) {
        if (n < 10) {
            return 0;
        } 
        int esCero = 0;
        if (n % 10 == 0){
            esCero = 1:
        }
        return esCero + contarCerosRec(n / 10);
    }
}

