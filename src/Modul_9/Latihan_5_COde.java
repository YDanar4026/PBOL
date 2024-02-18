/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Latihan_5_COde {

    public static void main(String[] args) {
       JFrame frame = new JFrame("Message Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null); // Mengatur layout ke null agar dapat menggunakan setBounds

        JLabel label = new JLabel("Message");
        label.setBounds(10, 10, 100, 20); // Mengatur posisi dan ukuran label
        panel.add(label);

        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea); // Menggunakan JScrollPane untuk JTextArea
        scrollPane.setBounds(10, 40, 380, 150); // Mengatur posisi dan ukuran JScrollPane, bukan JTextArea
        panel.add(scrollPane);

        JButton saveButton = new JButton("Save");
        JButton openButton = new JButton("Open");
        JButton clearButton = new JButton("Clear");

        saveButton.setBounds(10, 200, 80, 30); // Mengatur posisi dan ukuran tombol Save
        openButton.setBounds(100, 200, 80, 30); // Mengatur posisi dan ukuran tombol Open
        clearButton.setBounds(190, 200, 80, 30); // Mengatur posisi dan ukuran tombol Clear

        panel.add(saveButton);
        panel.add(openButton);
        panel.add(clearButton);


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        FileWriter writer = new FileWriter(file);
                        writer.write(textArea.getText());
                        writer.close();
                        JOptionPane.showMessageDialog(frame, "File berhasil disimpan.");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Error menyimpan file.");
                    }
                }
            }
        });

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;
                        StringBuilder content = new StringBuilder();
                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                        textArea.setText(content.toString());
                        reader.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Error membuka file.");
                    }
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        frame.setVisible(true);
    }
}