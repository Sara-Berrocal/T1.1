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


public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtGigabytes;
    JLabel lblMegabytes, lblkilobytes, lblBytes;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm05 frame = new frm05();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public frm05() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblGigabytes = new JLabel("Gigabytes :");
        lblGigabytes.setBounds(30, 30, 80, 30);
        getContentPane().add(lblGigabytes);
        
        txtGigabytes = new JTextField();
        txtGigabytes.setBounds(120, 30, 60, 30);
        txtGigabytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGigabytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtGigabytes);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 70, 120, 30);
        getContentPane().add(btnCalcular);
        
        lblMegabytes = new JLabel("Megabytes: ");
        lblMegabytes.setBounds(30, 110, 200, 30);
        getContentPane().add(lblMegabytes);

        lblkilobytes = new JLabel("kilobytes: ");
        lblkilobytes.setBounds(30, 110, 200, 30);
        getContentPane().add(lblkilobytes);

        lblBytes = new JLabel("Bytes; ");
        lblBytes.setBounds(30, 170, 200, 30);
        getContentPane().add(lblBytes);


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }


    protected void btnCalcular_actionPerformed() {
     double gigabytes = Double.parseDouble(txtGigabytes.getText());
     
     double megabytes = gigabytes * 1024; // 1GB = 1024MB
     double kilobytes = megabytes * 1024 // 1 MB = 1024kb
     double bytes     = kilobytes * 1024 // 1 kb = 1024 bytes

     DecimalFormat df = new DecimalFormat("###.00");
     lblMegabytes.setText("Megabytes: " + df.format(megabytes));
     lblkilobytes.setText("kilobytes: " + df.format(kilobytes));
     lblBytes.setText("Bytes: " + df.format(bytes));  
    
    }
}


