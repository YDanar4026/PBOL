/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Latihan5 implements ActionListener {

    private double bilangan1, bilangan2;
    private JButton button;
    private JTextField pesan1, pesan2, hasil;
    private JLabel label1, label2, label3;
    
    public static void main(String[] args) {
        new Latihan5();
    }
    
    public Latihan5() {
        JFrame frame = new JFrame();
        frame.setBounds(300, 200, 350, 205);
        frame.setTitle("Input Data");
        frame.setResizable(false);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        label1 = new JLabel("Panjang (m) ");
        label1.setBounds(20, 20, 80, 30);
        panel.add(label1);
        pesan1 = new JTextField();
        pesan1.setBounds(150, 20, 160, 30);
        panel.add(pesan1);
        
        label2 = new JLabel("Lebar (m) ");
        label2.setBounds(20, 55, 80, 30);
        panel.add(label2);
        pesan2 = new JTextField();
        pesan2.setBounds(150, 55, 160, 30);
        panel.add(pesan2);
        
        label3 = new JLabel("Luas (m2) ");
        label3.setBounds(20, 90, 80, 30);
        panel.add(label3);
        hasil = new JTextField();
        hasil.setBounds(150, 90, 160, 30);
        hasil.setBackground(Color.white);
        hasil.setEditable(false);
        panel.add(hasil);
        
        button = new JButton("Hitung");
        button.setBounds(150, 125, 80, 30);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setActionCommand(button.getText());
        panel.add(button);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
    @Override
     public void actionPerformed(ActionEvent event) {
         try {
             bilangan1 = Double.parseDouble(pesan1.getText());
             bilangan2 = Double.parseDouble(pesan2.getText());
             double jawab = 0;
             jawab = bilangan1*bilangan2;
             hasil.setText(jawab+" ");
         }catch(NumberFormatException error) {
             JOptionPane.showMessageDialog(null, "Maaf, hanya integer yang diperbolehkan!", "Error", JOptionPane.ERROR_MESSAGE);
         }
    }
    
}
