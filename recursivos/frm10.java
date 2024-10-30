import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
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
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero (m):");
        lblNumero.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumero); 
        
        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Calcular suma");
        btnCalcular.setBounds(50, 80, 150, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Suma: ");
        lblResultado.setBounds(50, 130, 200, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });
    }
    
    protected void btnCalcular_actionPerformed(){
        int m = Integer.parseInt(txtNumero.getText());
        int resultado = sumaPares(m);
        lblResultado.setText("Suma: " + resultado);
    }

    private int sumaPares(int m){
         if (m < 2) {
            return 0;
        }
        int par = m;
        if (m % 2 != 0) {
            par = m - 1;
        }
        return par + sumaPares(m - 2);
    }
}
