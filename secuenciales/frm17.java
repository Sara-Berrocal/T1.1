import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm017 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion;
    JLabel lblCentroSalud, lblComedorInfantil, lblEscuelaInfantil, lblAsiloAncianos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                try {
                    frm17 frame = new frm17();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });
    }


    public frm17() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Monto de la donacion: ");
        lblDonacion.setBounds(50, 30, 150, 30);
        getContentPane().add(lblDonacion);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(200, 30, 100, 30);
        txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDonacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDonacion);

        JButton btnCalcular = new JButton("Calcular Asignaciones");
        btnCalcular.setBounds(80, 80, 180, 30);
        getContentPane().add(btnCalcular);

        lblCentroSalud = new JLabel("Centro de Salud: ");
        lblCentroSalud.setBounds(50, 130, 250, 30);
        getContentPane().add(lblCentroSalud);

        lblComedorInfantil = new JLabel("Comedor Infantil: ");
        lblComedorInfantil.setBounds(50, 160, 250, 30);
        getContentPane().add(lblComedorInfantil);

        lblEscuelaInfantil = new JLabel("Escuela Infantil ");
        lblEscuelaInfantil.setBounds(50, 190, 250, 30);
        getContentPane().add(lblEscuelaInfantil);
        
        lblAsiloAncianos = new JLabel("Asilo de Ancianos:");
        lblAsiloAncianos.setBounds(50, 220, 250, 30);
        getContentPane().add(lblAsiloAncianos);

        btnCalcular.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try{
            double donacion = Double.parseDouble(txtDonacion.getText());
            
            double montoCentroSalud = donacion * 0.25;
            double montoComedorInfantil  = donacion * 0.35;
            double montoEscuelaInfantil   = donacion * 0.25;
            double montoAsiloAncianos  = donacion - (montoCentroSalud + montoComedorInfantil + montoEscuelaInfantil);

            DecimalFormat df = new DecimalFormat("###.00");
            lblCentroSalud.setText("Centro de Salud: " + df.format(montoCentroSalud));
            lblComedorInfantil.setText("Comedor Infantil: " + df.format(montoComedorInfantil));
            lblEscuelaInfantil.setText("Escuela Infantil: " + df.format(montoEscuelaInfantil));
            lblAsiloAncianos.setText("Asilo de Ancianos: " + df.format(montoAsiloAncianos));
        
        } cath (NumberFormatException e) {
            lblCentroSalud.setText("Ingrese un monto valido: ");
            lblComedorInfantil.setText("");
            lblEscuelaInfantil.setText("");
            lblAsiloAncianos.setText("");
        }
    }
}