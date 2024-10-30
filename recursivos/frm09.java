import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 

public class frm09 extends JFrame {
    private JTextField txtCadena;
    private JLabel lblResultado;

 
    public frm09() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        txtCadena = new JTextField();
        txtCadena.setBounds(50, 30, 200, 30);
        add(txtCadena);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(50, 80, 200, 30);
        btnVerificar.addActionListener(e -> verificar());
        add(btnVerificar);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 120, 250, 30);
        add(lblResultado);
    }
    private void verificar(){
        String cadena = txtCadena.getText().replace(" ", "").toLowerCase();
        boolean esPalidromo = esPalidromo(cadena);
        lblResultado.settext("Palindromo: " + esPalidromo);
    } 
    private boolean esPalidromo(String cadena){
        String reverso = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(reverso);
    }
    public static void main(String[] args){
        PalindromoApp app = new PalindromoApp();
        app.setVisible(true);
    }
}
