import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm03() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero: ");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero); 
        
        txtNumero= new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JButton btnContar = new JButton("Contar Digitos");
        btnContar.setBounds(80, 80, 130, 30);
        getContentPane().add(btnContar);

        lblResultado = new JLabel("Cantidad de digitos: ");
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
         int numero = Integer.parseInt(txtNumero.getText());
         int cantidad = contarDigitos(numero);
         lblResultado.setText("Cantidad de digitos: " + cantidad);
    }

    private int contarDigitos (int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + contarDigitos(n / 10);
    }
}
