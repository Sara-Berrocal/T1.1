package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm21 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroempleado, txtEstadocivil, txtEdad, txtSexo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm21 frame = new frm21();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm21() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroempleado = new JLabel("Numero empleado: ");
        lblNumeroempleado.setBounds(30, 30, 150, 30);
        getContentPane().add(lblNumeroempleado);

        txtNumeroempleado = new JTextField();
        txtNumeroempleado.setBounds(180, 30, 100, 30);
        txtNumeroempleado.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroempleado);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(30, 70, 250, 30);
        btnVerificar.addActionListener(e -> btnVerificar_actionPerformed);
        getContentPane().add(btnVerificar);

        txtEstadocivil = new JTextField();
        txtEstadocivil.setBounds(30, 110, 250, 30);
        txtEstadocivil.setEditable(false);
        getContentPane().add(txtEstadocivil);

        txtEdad= new JTextField();
        txtEdad.setBounds(30, 150, 250, 30);
        txtEdad.setEditable(false);
        getContentPane().add(txtEdad);

        txtSexo = new JTextField();
        txtSexo.setBounds(30, 190, 250, 30);
        txtSexo.setEditable(false);
        getContentPane().add(txtSexo);
    }

    protected void btnVerificar_actionPerformed() {
        int numero = Integer.parseInt(txtNumeroempleado.getText());
        int estadoCivil = numero / 1000;
        int edad = (numero / 10) % 100;
        int sexo = numero % 10;

        String estadoCivilStr = switch (estadoCivil){
            case 1 -> "Soltero";
            case 2 -> "Casado";
            case 3 -> "Divorciado";
            case 4 -> "Viudo";
            default -> "Desconocido";
        };

        String sexoStr = (sexo == 1) ? "Masculino" : "Femenino";
        String resultado = "Estado Civil: " + estadoCivilStr + "\nEdad: " + edad + "\nSexo: " + sexoStr;

        txtResultado.setText(resultado);
    }
}

        
