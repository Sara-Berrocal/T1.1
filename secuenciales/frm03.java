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


public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtkm, txtPies, txtMillas;
    JLabel lblTotalMetros, lblTotalYardas;


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
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        JLabel lblkm = new JLabel("kilometros :");
        lblkm.setBounds(30, 30, 80, 30);
        getContentPane().add(lblkm);


        JLabel lblPies = new JLabel("Pies :");
        lblPies.setBounds(30, 70, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblMillas = new JLabel("Millas :");
        lblMillass.setBounds(30, 110, 80, 30);
        getContentPane().add(lblMillas);
        
        txtkm = new JTextField();
        txtkm.setBounds(120, 30, 60, 30);
        txtkm.setHorizontalAlignment(SwingConstants.RIGHT);
        txtkm.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtkm);
        
        txtPies = new JTextField();
        txtPies.setBounds(120, 70, 60, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtMillas = new JTextField();
        txtMillas.setBounds(120, 110, 60, 30);
        txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMillas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMillas);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 160, 120, 30);
        getContentPane().add(btnCalcular);

        lblTotalMetros = new JLabel("Totak en Metros: ");
        lblTotalMetros.setBounds(30, 200, 200, 30);
        getContentPane().add(lblTotalMetros);

        lblTotalYardas = new JLabel("Totak en Yardas: ");
        lblTotalYardas.setBounds(30, 220, 200, 30);
        getContentPane().add(lblTotalYardas);   

        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
        double tramo1km = Double.parseDouble(txtkm.getText());
        double  tramo2Pies = Double.parseDouble(txtPies.getText());
        double  tramo3Millas = Double.parseDouble(txtMillas.getText());
        
        double tramo1Metros = tramo1km * 1000; //km a m
        double tramo2Metros = tramo2Pies / 3.2808; // pies a m
        double tramo3Metros = tramo3Millas * 1609; // millas a m

        double totalMetros = tramo1Metros + tramo2Metros + tramo3Metros;

        double totalYardas = totalMetros * 1.09361;

        DecimalFormat df = new DecimalFormat("###.00");
        lblTotalMetros.setText("Total en Metros: " + df.format(totalMetros) );
        lblTotalYardas.setText("Total en Yardas: " + df.format(totalYardas) );
        
    }
}