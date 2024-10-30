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


public class frm013 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCatetoA, txtCatetoB;
    JLabel lblResultado;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm13() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblCatetoA = new JLabel("Cateto A:");
        lblCatetoA.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCatetoA);

        txtCatetoA = new JTextField();
        txtCatetoA.setBounds(180, 30, 60, 30);
        txtCatetoA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCatetoA);
   
        JLabel lblCatetoB = new JLabel("Cateto B:");
        lblCatetoB.setBounds(50, 80, 120, 30);
        getContentPane().add(lblCatetoB);

        txtCatetoB = new JTextField();
        txtCatetoB.setBounds(180, 80, 60, 30);
        txtCatetoB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCatetoB);

        JButton btnICalcular = new JButton("Calcular Hipotenusa");
        btnCalcular.setBounds(50, 130, 180, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Hipotenusa: ");
        lblResultado.setBounds(50, 180, 200, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
        try{
            double catetoA = Double.parseDouble(txtCatetoA.getText());
            double catetoB = Double.parseDouble(txtCatetoB.getText());
            
            double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
            lblResultado.setText("Hipotenusa: " + hipotenusa);        
        } catch (NumberFormatException e){
            lblResultado.setText("Ingrese valores válidos: ")
        }
    }
}
