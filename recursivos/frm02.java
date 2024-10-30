import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtLista;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            public void run() {
                try {
                    frm02 frame = new frm02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm02() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblLista = new JLabel("Lista(numeros separados por comas):");
        lblLista.setBounds(50, 30, 220, 30);
        getContentPane().add(lblLista); 
        
        txtLista= new JTextField();
        txtLista.setBounds(50, 70, 200, 30);
        txtLista.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtLista);

        JButton btnSumar = new JButton("Sumar");
        btnSumar.setBounds(80, 120, 130, 30);
        getContentPane().add(btnSumar);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 170, 200, 30);
        getContentPane().add(lblResultado);

        btnSumar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnSumar_actionPerformed();
            }
        });
    }
    
    protected void btnSumar_actionPerformed(){
         String[] valores = txtLista.getText().split(",");
         int[] numeros = new int[valores.length];
         
         for (int i = 0; i < valores.length; i++) {
            numeros[i] = Integer.parseInt(valores[i].trim());
         }
         int resultado = Sumar(numeros, numeros.length);
         lblResultado.setText("Suma: " + resultado);
    }

    private int Sumar(int[] numeros, int n) {
        if (n == 0) {
            return 0;
        }
        return numeros[n - 1] + sumar(numeros, n - 1);
    }
}
