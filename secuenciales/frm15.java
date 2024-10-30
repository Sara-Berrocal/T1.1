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


public class frm015 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtJuan, txtRosa, txtDaniel;
    JLabel lblTotalDolares, lblPorcentajeJuan, lblPorcentajeRosa, lblPorcentajeDaniel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                try {
                    frm15 frame = new frm15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });
    }


    public frm15() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblJuan = new JLabel("Aporte de Juan (USD):");
        lblJuan.setBounds(50, 30, 150, 30);
        getContentPane().add(lblJuan);

        txtJuan = new JTextField();
        txtJuan.setBounds(200, 30, 60, 30);
        txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtJuan);
        
        JLabel lblRosa = new JLabel("Aporte de Rosa (USD):");
        lblRosa.setBounds(50, 80, 150, 30);
        getContentPane().add(lblRosa);

        txtRosa = new JTextField();
        txtRosa.setBounds(200, 80, 60, 30);
        txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRosa);

        
        JLabel lblDaniel = new JLabel("Aporte de Daniel (S/.):");
        lblDaniel.setBounds(50, 130, 150, 30);
        getContentPane().add(lblDaniel);

        txtDaniel = new JTextField();
        txtDaniel.setBounds(200, 130, 60, 30);
        txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDaniel);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 180, 130, 30);
        getContentPane().add(btnCalcular);

        lblTotalDolares = new JLabel("Total en dolares: ");
        lblTotalDolares.setBounds(50, 220, 200, 30);
        getContentPane().add(lblTotalDolares);

        lblPorcentajeJuan = new JLabel("Juan: ");
        lblPorcentajeJuan.setBounds(50, 240, 200, 30);
        getContentPane().add(lblPorcentajeJuan);

        lblPorcentajeRosa = new JLabel("Rosa: ");
        lblPorcentajeRosa.setBounds(50, 260, 200, 30);
        getContentPane().add(lblPorcentajeRosa);

        lblPorcentajeDaniel = new JLabel("Daniel: ");
        lblPorcentajeJuan.setBounds(50, 280, 200, 30);
        getContentPane().add(lblPorcentajeDaniel);

        btnCalcular.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try{
            double aporteJuan = Double.parseDouble(txtJuan.getText());
            double aporteRosa = Double.parseDouble(txtRosa.getText());
            double aporteDaniel = Double.parseDouble(txtDaniel.getText());

            double aporteDanielDolares = aporteDaniel / 3.00;

            double capitalTotal = aporteJuan + aporteRosa + aporteDanielDolares;

            double porcentajeJuan = (aporteJuan / capitalTotal) * 100;
            double porcentajeRosa = (aporteRosa / capitalTotal) * 100;
            double porcentajeDaniel = (aporteDanielDolares / capitalTotal) * 100;

            DecimalFormat df = new DecimalFormat("###.00");
            lblTotalDolares.setText("Total en dolares: " + df.format(capitalTotal));
            lblPorcentajeJuan.setText("Juan: " + df.format(porcentajeJuan) + "%");
            lblPorcentajeRosa.setText("ROsa " + df.format(porcentajeRosa) + "%");
            lblPorcentajeDaniel.setText("Daniel: " + df.format(porcentajeDaniel) + "%");       
        } cath (NumberFormatException e) {
            lblTotalDolares.setText("Ingrese valores validos: ");
            lblPorcentajeJuan.setText("");
            lblPorcentajeRosa.setText("");
            lblPorcentajeDaniel.setText("");
        }
    }
}

        
        