import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm06() {
        
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

        JButton btnCalcular = new JButton("Calcular Valor Absoluto");
        btnCalcular.setBounds(80, 80, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Valor Absoluto: ");
        lblResultado.setBounds(50, 120, 200, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });
    }
    
    protected void btnCalcular_actionPerformed(){
        int n = Integer.parseInt(txtNumero.getText());
        lblResultado.setText("Valor Absoluto: " + valorAbsoluto(n));    
    }

    private int valorAbsoluto(int n) {
        int resultado;
        if (n < 0) {
            resultado = -n;
        } else {
            resultado = n;
        }
            return resultado;
    }
}

