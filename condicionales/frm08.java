package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtExamenesAprobados, txtTotalPropina;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblExamenesAprobados= new JLabel("Examenes Aprobados: ");
        lblExamenesAprobados.setBounds(50, 30, 150, 30);
        getContentPane().add(lblExamenesAprobados);

        txtExamenesAprobados = new JTextField();
        txtExamenesAprobados.setBounds(200, 30, 60, 30);
        txtExamenesAprobados.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtExamenesAprobados);

        JButton btnCalcular = new JButton("Calcular Propina: ");
        btnCalcular.setBounds(80, 80, 200, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        Jlabel lblTotalPropina = new Jlabel("Numero Intermedio: ");
        lblTotalPropina.setBounds(50, 130, 150, 30);
        getContentPane().add(lblTotalPropina);

        txtTotalPropina = new JTextField();
        txtTotalPropina.setBounds(200, 130, 150, 30);
        txtTotalPropina.setEditable(false);
        getContentPane().add(txtTotalPropina);

    }

    protected void btnCalcular_actionPerformed(){
       int examenesAprobados = Integer.parseInt(txtExamenesAprobados.getText());
       
       int propinaBase =20;
       int propinaAdicional = examenesAprobados * 5;

       int totalPropina = propinaBase + propinaAdicional;

       txtTotalPropina.setText(String.valueOf(totalPropina));
    } 
}