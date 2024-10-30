import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            frm05 frame = new frm05();
            frame.setVisible(true);
        });
    }


    public frm05() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(new FlowLayout());

        add(new JLabel("Numero (m): "));
        txtNumero = new JTextField(10);
        add(txtNumero);

        JButton btnGenerar = new JButton("Generar Cuadrados");
        btnGenerar.addActionListener(e -> btnGenerar_actionPerfomed());
        add(btnGenerar);
    }

    private void btnGenerar_actionPerfomed() {
        int m = Integer.parseInt(txtNumero.getText());
        StringBuilder resultado = new StringBuilder();
        for ( int i = 1; i <= m; i++){
            resultado.append(i * i).append(" ");
        }
        lblResultado.setText("Cuadrados: " + resultado.toString());
    }
}
