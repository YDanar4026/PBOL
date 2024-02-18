/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Latihan_2c {
    public static void main(String[] args) {
            StreamUI streamUI = new StreamUI();
            streamUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            streamUI.setSize(300, 150);
            streamUI.setVisible(true);
        }
    }
    
    class StreamUI extends JFrame {
    public StreamUI() {
        super("Stream");
        setLayout(new FlowLayout());

        JButton openButton = new JButton("Open");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String message = "Anda membuka file " + selectedFile.getAbsolutePath();
                    JOptionPane.showMessageDialog(null, message, "Open Dialog", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showSaveDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String message = "Anda menyimpan di " + selectedFile.getAbsolutePath();
                    JOptionPane.showMessageDialog(null, message, "Save Dialog", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(openButton);
        add(saveButton);
    }
}