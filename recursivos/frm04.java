import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
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


    public frm04() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero (m):");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero); 
        
        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JButton btnImprimir = new JButton("Imprimir Numeros");
        btnImprimir.setBounds(80, 80, 150, 30);
        getContentPane().add(btnImprimir);

        lblResultado = new JLabel("Numeros: ");
        lblResultado.setBounds(50, 120, 200, 30);
        getContentPane().add(lblResultado);

        btnImprimir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnImprimir_actionPerformed();
            }
        });
    }
    
    protected void btnImprimir_actionPerformed(){
        int m = Integer.parseInt(txtNumero.getText());
        StringBuilder resultado = new StringBuilder();
        numeAscendente(m, resultado);
        lblResultado.setText("Numeros: " + resultado.toString());    
    }

    private void numeAscendente(int m, StringBuilder resultado) {
        if (m == 0) {
            return;
        }
        numeAscendente(m - 1, resultado);
        resultado.append(m).append(" ");
    }
}
