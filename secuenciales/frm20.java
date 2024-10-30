import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });
    }


    public frm20() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad= new JLabel("Cantidad en soles: ");
        lblCantidad.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad new JTextField();
        txtCantidad.setBounds(180, 30, 60, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        JButton btnDescomponer = new JButton("Descomponer");
        btnDescomponer.setBounds(80, 80, 130, 30);
        getContentPane().add(btnDescomponer);

        lblResultado = new JLabel();
        lblResultado.setBounds(50, 120, 200, 150);
        getContentPane().add(lblResultado);

        btnDescomponer.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                descomponerDinero();
            }
        });
    }
b
    protected void descomponerDinero() {
       int cantidad = Integer.parseInt(txtCantidad.getText());
       strin resultado = "";

       resultado += ( cantidad / 200) + "billete(s) de S/. 200\n";
       cantidad %= 200;
       
       resultado += ( cantidad / 100) + "billete(s) de S/. 100\n";
       cantidad %= 100;
       
       resultado += ( cantidad / 50) + "billete(s) de S/. 50\n";
       cantidad %= 50;
       
       resultado += ( cantidad / 20) + "billete(s) de S/. 20\n";
       cantidad %= 20;
       
       resultado += ( cantidad / 10) + "billete(s) de S/. 10\n";
       cantidad %= 10;

       resultado += (cantidad / 5) + "moneda(s) de S/. 5\n";
       cantidad %= 5;

       resultado += (cantidad / 2) + "moneda(s) de S/. 2\n";
       resultado += (cantidad % 2) + "moneda(s) de S/. 1\n";

       lblResultado.setText(resultado);
    }
}