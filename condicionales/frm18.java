package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontodonacion, txtCentroSalud, txtComedorNiños, txtInversion;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm18 frame = new frm18();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm18() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontodonacion = new JLabel("Monto de la donacion: ");
        lblMontodonacion.setBounds(50, 30, 150, 30);
        getContentPane().add(lblMontodonacion);

        txtMontodonacion = new JTextField();
        txtMontodonacion.setBounds(200, 30, 100, 30);
        txtMontodonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMontodonacion);

        JButton btnCalcular = new JButton("Calcular Distribucion");
        btnCalcular.setBounds(50, 80, 250, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblCentroSalud = new Jlabel("Centro de Salud: ");
        lblCentroSalud.setBounds(50, 130, 120, 30);
        getContentPane().add(lblCentroSalud);

        txtCentroSalud = new JTextField();
        txtCentroSalud.setBounds(200, 130, 100, 30);
        txtCentroSalud.setEditable(false);
        getContentPane().add(txtCentroSalud);

        Jlabel lblComedorNiños = new Jlabel("Comedor de Niños: ");
        lblComedorNiños.setBounds(50, 170, 120, 30);
        getContentPane().add(lblComedorNiños);

        txtComedorNiños = new JTextField();
        txtComedorNiños.setBounds(200, 170, 100, 30);
        txtComedorNiños.setEditable(false);
        getContentPane().add(txtComedorNiños);

        Jlabel lblInversion = new Jlabel("Inversion: ");
        lblInversion.setBounds(50, 210, 120, 30);
        getContentPane().add(lblInversion);

        txtInversion = new JTextField();
        txtInversion.setBounds(200, 210, 100, 30);
        txtInversion.setEditable(false);
        getContentPane().add(txtInversion);
    }

    protected void btnCalcular_actionPerformed(){
        double montoDonacion = Double.parseDouble(txtMontodonacion.getText());
        double centroSalud, comedorNiños, inversion;

        if ( montoDonacion >= 10000){
           centroSalud = montoDonacion * 0.30;
           comedorNiños = montoDonacion * 0.50;
        } else {
            centroSalud = montoDonacion * 0.25;
            comedorNiños = montoDonacion * 0.60;
        }
        inversion = montoDonacion - centroSalud - comedorNiños;

        txtCentroSalud.setText(String.format("%.2f", centroSalud));
        txtComedorNiños.setText(String.format("%.2f", comedorNiños));
        txtInversion.setText(String.format("%.2f", inversion));
    }
}