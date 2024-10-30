import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtDigito;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm01() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero :");
        lblNumero.setBounds(50, 30, 80, 30);
        getContentPane().add(lblNumero); 
        
        txtNumero = new JTextField();
        txtNumero.setBounds(130, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JLabel lblDigito = new JLabel("Digito :");
        lblDigito.setBounds(50, 80, 80, 30);
        getContentPane().add(lblDigito); 
        
        txtDigito = new JTextField();
        txtDigito.setBounds(130, 80, 100, 30);
        txtDigito.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDigito);

        JButton btnContar = new JButton("Contar");
        btnContar.setBounds(80, 130, 130, 30);
        getContentPane().add(btnContar);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 170, 200, 30);
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
        int digito = Integer.parseInt(txtDigito.getText());
        int resultado = contarDigito(numero, digito);
        lblResultado.setText("Cantidad de veces: " + resultado);    
    }
    private int contarDigito(int n, int digit) {
        return (n == 0) * 0 + (n % 10 == digit) * 1 + contarDigito(n / 10, digit);
    }
}
