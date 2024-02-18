/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_7;

import javax.swing.*;
import java.awt.event.*;

public class Latihan_4 {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Pendaftaran Seminar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 200, 400, 250);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(20, 20, 80, 30);
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(200, 20, 160, 30);
        
        JLabel labelNomorInduk = new JLabel("Nomor Induk");
        labelNomorInduk.setBounds(20, 55, 80, 30);
        JTextField textFieldNIM = new JTextField();
        textFieldNIM.setBounds(200, 55, 160, 30);
        
        JLabel labelStatus = new JLabel("Status");
        labelStatus.setBounds(20, 90, 150, 30);
        JComboBox<String> comboBoxStatus = new JComboBox<String>();
        comboBoxStatus.addItem("Mahasiswa");
        comboBoxStatus.addItem("Dosen");
        comboBoxStatus.setBounds(200, 90, 160, 30);

        JButton buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(200, 125, 80, 30);

        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = textFieldNIM.getText();
                String selectedStatus = (String) comboBoxStatus.getSelectedItem();

                if (nim.length() != 9) {
                    JOptionPane.showMessageDialog(null, "Nomor induk harus terdiri dari 9 digit.");
                } else {
                    String twoDigitPrefix = nim.substring(0, 2);
                    try {
                        int prefix = Integer.parseInt(twoDigitPrefix);
                        
                        if (prefix < 13) {
                            JOptionPane.showMessageDialog(null, "Pendaftaran berhasil");
                        } else {
                            JOptionPane.showMessageDialog(null, "Hanya angkatan 13 kebawah yang bisa mendaftar");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Dua digit pertama dari Nomor Induk harus berupa angka");
                    }
                }
            }
        });

        panel.add(labelNama);
        panel.add(textFieldNama);
        panel.add(labelNomorInduk);
        panel.add(textFieldNIM);
        panel.add(labelStatus);
        panel.add(comboBoxStatus);
        panel.add(buttonSimpan);

        frame.add(panel);
        frame.setVisible(true);
        
    }
}
