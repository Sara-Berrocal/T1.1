package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtAngulo, txtClasificacion;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
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
        setBounds(0, 0, 400, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAngulo = new JLabel("Angulo (en grados): ");
        lblAngulo.setBounds(50, 50, 150, 30);
        getContentPane().add(lblAngulo);

        txtAngulo = new JTextField();
        txtAngulo.setBounds(200, 50, 60, 30);
        txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAngulo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAngulo);

        JButton btnClasificar = new JButton("Clasificar");
        btnClasificar.setBounds(100, 100, 150, 30);
        btnClasificar.addActionListener(e -> btnClasificar_actionPerformed());
        getContentPane().add(btnClasificar);

        Jlabel lblClasificacion = new Jlabel("Clasificacion: ");
        lblClasificacion.setBounds(50, 150, 150, 30);
        getContentPane().add(lblClasificacion);

        txtClasificacion = new JTextField();
        txtClasificacion.setBounds(200, 150, 150, 30);
        txtClasificacion.setEditable(false);
        getContentPane().add(txtClasificacion);

    }

    protected void btnClasificar_actionPerformed(){
        int angulo = Integer.parseInt(txtAngulo.getText());
        String Clasificacion;

        if (angulo == 0) {
           Clasificacion = "Nulo";
        } else if (angulo > 0 && angulo < 90){
            Clasificacion = "Agudo";            
        } else if (angulo == 90){
            Clasificacion = "Recto";
        } else if (angulo > 90 && angulo < 180) {
            Clasificacion = "Obtuso";
        } else if (angulo == 180){
            Clasificacion = "Llano";
        } else if (angulo > 180 && angulo < 360) {
            Clasificacion = "Concavo";
        } else if (angulo == 360) {
            Clasificacion ="Completo";
        } else {
            clasificacion = "Angulo fuera de rango."
        }        
            txtClasificacion.setText(clasificacion);
    } 
}