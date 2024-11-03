package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm28 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHora24, txtHora12;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm28 frame = new frm28();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm28() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHora24 = new JLabel("Hora (24h):");
        lblHora24.setBounds(30, 30, 100, 30);
        getContentPane().add(lblHora24);

        txtHora24 = new JTextField();
        txtHora24.setBounds(130, 30, 100, 30);
        txtHora24.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtHora24);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(30, 80, 200, 30);
        btnConvertir.addActionListener(e -> btnConvertir_actionPerformed());
        getContentPane().add(btnConvertir);

        JLabel lblHora12 = new JLabel("Hora (12h):");
        lblHora12.setBounds(30, 120, 100, 30);
        getContentPane().add(lblHora12);

        txtHora12 = new JTextField();
        txtHora12.setBounds(130, 120, 100, 30);
        txtHora12.setEditable(false);
        getContentPane().add(txtHora12);
    }

    protected void btnConvertir_actionPerformed() {
        String hora24 = txtHora24.getText();
        if (hora24.length() != 5) {
            txtHora12.setText("Hora inválida");
            return;
        }

        int horas = (hora24.charAt(0) - '0') * 10 + (hora24.charAt(1) - '0');
        int minutos = (hora24.charAt(3) - '0') * 10 + (hora24.charAt(4) - '0');

        if (horas < 0) {
            txtHora12.setText("Hora inválida");
            return;
        }
        if (horas > 23) {
            txtHora12.setText("Hora inválida");
            return;
        }
        if (minutos < 0) {
            txtHora12.setText("Hora inválida");
            return;
        }
        if (minutos > 59) {
            txtHora12.setText("Hora inválida");
            return;
        }

        String periodo = "AM";
        if (horas >= 12) {
            periodo = "PM";
        }

        if (horas == 0) {
            horas = 12;
        }
        if (horas > 12) {
            horas = horas - 12;
        }

        String minutosStr = "00";
        if (minutos < 10) {
            minutosStr = "0" + minutos;
        } else {
            minutosStr = String.valueOf(minutos);
        }

        txtHora12.setText(horas + ":" + minutosStr + " " + periodo);
    }
}
