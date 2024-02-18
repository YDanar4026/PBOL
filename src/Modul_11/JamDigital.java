/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_11;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JamDigital extends JFrame implements Runnable {
    private JLabel labelWaktu;

    public JamDigital() {
        super("Jam Digital");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelWaktu = new JLabel("", JLabel.CENTER);
        labelWaktu.setFont(new Font("Arial", Font.PLAIN, 24));
        add(labelWaktu);

        Thread threadUpdateWaktu = new Thread(this);
        threadUpdateWaktu.start();
    }

    @Override
    public void run() {
        while (true) {
            Calendar kalender = Calendar.getInstance();
            int detik = kalender.get(Calendar.SECOND);
            int menit = kalender.get(Calendar.MINUTE);
            int jam = kalender.get(Calendar.HOUR_OF_DAY);

            String waktuStr = String.format("%02d:%02d:%02d", jam, menit, detik);

            SwingUtilities.invokeLater(() -> {
                labelWaktu.setText(waktuStr);
            });

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JamDigital().setVisible(true);
        });
    }
}
