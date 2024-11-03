package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm35 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCodigo, txtEmpleado;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm35 frame = new frm35();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm35() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCodigo= new JLabel("Codigo (3cifras): ");
        lblCodigo.setBounds(30, 30, 130, 30);
        getContentPane().add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(150, 30, 100, 30);
        txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCodigo);

        JButton btnCalcular = new JButton("Determinar Tipo ");
        btnCalcular.setBounds(30, 80, 220, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblTipoEmpleado = new Jlabel("Tipo de Empleado: ");
        lblTipoEmpleado.setBounds(30, 130, 130, 30);
        getContentPane().add(lblTipoEmpleado);

        txtTipoEmpleado = new JTextField();
        txtTipoEmpleado.setBounds(150, 130, 100, 30);
        txtTipoEmpleado.setEditable(false);
        getContentPane().add(txtTipoEmpleado);

    }

    protected void btnCalcular_actionPerformed(){

        int codigp = Integer.parseInt(txtCodigo.getText());
        String tipo;

        if (codigo % 2 && codigo % 3 == 0 && codigo % 5 == 0) {
            tipo = "Administrativo";
        } else if (codigo % 3 == 0 && codigo % 5 == 0){
            tipo = "Directivo";
        } else if (codigo % 2 == 0){
             tipo = "Vendedor";
        } else {
            tipo = "Seguridad";  
        }

        txtTipoEmpleado.setText(tipo);
    } 
}