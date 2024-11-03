package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm37 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtVotosPamela, txtVotosCarol, txtVotosFanny, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm37 frame = new frm37();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm37() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVotosPamela = new JLabel("Votos Pamela:");
        lblVotosPamela.setBounds(20, 20, 100, 30);
        getContentPane().add(lblVotosPamela);

        txtVotosPamela = new JTextField();
        txtVotosPamela.setBounds(130, 20, 50, 30);
        txtVotosPamela.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtVotosPamela);

        JLabel lblVotosCarol = new JLabel("Votos Carol:");
        lblVotosCarol.setBounds(20, 60, 100, 30);
        getContentPane().add(lblVotosCarol);

        txtVotosCarol = new JTextField();
        txtVotosCarol.setBounds(130, 60, 50, 30);
        txtVotosCarol.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtVotosCarol);

        JLabel lblVotosFanny = new JLabel("Votos Fanny:");
        lblVotosFanny.setBounds(20, 100, 100, 30);
        getContentPane().add(lblVotosFanny);

        txtVotosFanny = new JTextField();
        txtVotosFanny.setBounds(130, 100, 50, 30);
        txtVotosFanny.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtVotosFanny);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(20, 140, 160, 30);
        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        getContentPane().add(btnCalcular);

        txtResultado = new JTextField();
        txtResultado.setBounds(20, 180, 240, 30);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);
    }

    protected void btnCalcular_actionPerformed() {
        int votosPamela = Integer.parseInt(txtVotosPamela.getText());
        int votosCarol = Integer.parseInt(txtVotosCarol.getText());
        int votosFanny = Integer.parseInt(txtVotosFanny.getText());

        int totalVotos = votosPamela + votosCarol + votosFanny;
        int mitadVotos = totalVotos / 2 + 1;

        if (votosPamela >= mitadVotos) {
            txtResultado.setText("Ganadora: Pamela");
        } else if (votosCarol >= mitadVotos) {
            txtResultado.setText("Ganadora: Carol");
        } else if (votosFanny >= mitadVotos) {
            txtResultado.setText("Ganadora: Fanny");
        } else {
            if (votosPamela == votosCarol && votosPamela == votosFanny) {
                txtResultado.setText("Empate entre los tres.");
            } else {
                String primero = (votosPamela > votosCarol) ? 
                    ((votosPamela > votosFanny) ? "Pamela" : "Fanny") : 
                    ((votosCarol > votosFanny) ? "Carol" : "Fanny");
                String segundo = (votosPamela < votosCarol) ? 
                    ((votosPamela < votosFanny) ? "Pamela" : "Fanny") : 
                    ((votosCarol < votosFanny) ? "Carol" : "Fanny");
                txtResultado.setText("Primera vuelta: " + primero + " y " + segundo + " a segunda vuelta.");
            }
        }
    }
}