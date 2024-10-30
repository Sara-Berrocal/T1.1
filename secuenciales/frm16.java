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


public class frm016 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtTarifaHoraria;
    JLabel lblSueldoBasico, lblSueldoBruto, lblSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                try {
                    frm16 frame = new frm16();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        });
    }


    public frm16() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas: ");
        lblHorasTrabajadas.setBounds(50, 30, 150, 30);
        getContentPane().add(lblHorasTrabajadas);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(200, 30, 60, 30);
        txtHorasTrabajadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHorasTrabajadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHorasTrabajadas);

        JLabel lblTarifaHoraria = new JLabel("Tarifa horaria: ");
        lblTarifaHoraria.setBounds(50, 80, 150, 30);
        getContentPane().add(lblTarifaHoraria);

        txtTarifaHoraria = new JTextField();
        txtTarifaHoraria.setBounds(200, 80, 60, 30);
        txtTarifaHoraria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTarifaHoraria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTarifaHoraria);

        JButton btnCalcular = new JButton("Calcular Sueldo");
        btnCalcular.setBounds(80, 130, 180, 30);
        getContentPane().add(btnCalcular);

        lblSueldoBasico = new JLabel("Sueldo Basico: ");
        lblSueldoBasico.setBounds(50, 180, 250, 30);
        getContentPane().add(lblSueldoBasico);

        lblSueldoBruto = new JLabel("Sueldo Bruto: ");
        lblSueldoBruto.setBounds(50, 210, 250, 30);
        getContentPane().add(lblSueldoBruto);

        lblSueldoNeto = new JLabel("Sueldo Neto ");
        lblSueldoNeto.setBounds(50, 240, 250, 30);
        getContentPane().add(lblSueldoNeto);

        btnCalcular.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try{
            double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
            double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());
        
            double sueldoBasico = horasTrabajadas * tarifaHoraria;
            double sueldoBruto  = sueldoBasico * 1.20;
            double sueldoNeto   = sueldoBruto * 0.90;
            
            DecimalFormat df = new DecimalFormat("###.00");
            lblSueldoBasico.setText("Sueldo Basico: " + df.format(sueldoBasico));
            lblSueldoBruto.setText("Sueldo Bruto: " + df.format(sueldoBruto));
            lblSueldoNeto.setText("Sueldo Neto: " + df.format(sueldoNeto));
        } cath (NumberFormatException e) {
            lblSueldoBasico.setText("Ingrese valores validos: ");
            lblSueldoBruto.setText("");
            lblSueldoNeto.setText("");
        }
    }
}