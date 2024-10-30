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


public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPies, txtPulgadas;
    JLabel lblTEstaturaMetros;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
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
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblPies = new JLabel("Pies :");
        lblPies.setBounds(30, 30, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblPulgadas = new JLabel("Pulgadas :");
        lblPulgadas.setBounds(30, 70, 80, 30);
        getContentPane().add(lblPulgadas); 
        
        txtPies = new JTextField();
        txtPies.setBounds(120, 30, 60, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(120, 70, 60, 30);
        txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPulgadas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 110, 120, 30);
        getContentPane().add(btnCalcular);
        
        lblTEstaturaMetros = new JLabel("Estatura en Metros; ");
        lblTEstaturaMetros.setBounds(30, 150, 200, 30);
        getContentPane().add(lblTEstaturaMetros);


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
        int pies = Integer.parseInt(txtPies.getText());        
        int pulgadas = Integer.parseInt(txtPulgadas.getText());

        double estaturaMetros = (pies * 0.3048) + (pulgadas * 0.0254);

        DecimalFormat df = new DecimalFormat("###.00");
        lblTEstaturaMetros.setText("Estaturs rn Metros: " + df.format(estaturaMetros));
    }
}


