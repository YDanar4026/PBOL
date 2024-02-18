/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Latihan_5  implements ActionListener {

    private double bilangan1, bilangan2;
    private JButton button1, button2, button3, button4;
    private JTextField pesan1, pesan2, hasil;
    private JLabel label1, label2, label3;
    
    
    public static void main(String[] args) {
        new Latihan_5();
    }
    
    
    public Latihan_5() {
        JFrame frame = new JFrame();
        frame.setBounds(300, 200, 350, 250);
        frame.setTitle("Input Data");
        frame.setResizable(false);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        label1 = new JLabel("Bilangan 1");
        label1.setBounds(20, 20, 80, 30);
        panel.add(label1);
        pesan1 = new JTextField();
        pesan1.setBounds(150, 20, 160, 30);
        panel.add(pesan1);
        
        label2 = new JLabel("Bilangan 2");
        label2.setBounds(20, 55, 80, 30);
        panel.add(label2);
        pesan2 = new JTextField();
        pesan2.setBounds(150, 55, 160, 30);
        panel.add(pesan2);
        
        label3 = new JLabel("Hasil");
        label3.setBounds(20, 90, 80, 30);
        panel.add(label3);
        hasil = new JTextField();
        hasil.setBounds(150, 90, 160, 30);
        hasil.setBackground(Color.white);
        hasil.setEditable(false);
        panel.add(hasil);
        
        
        button1 = new JButton("Jumlah");
        button1.setBounds(150, 125, 80, 30);
        button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setActionCommand(button1.getText());
        panel.add(button1);
        
        button2 = new JButton("Kurang");
        button2.setBounds(230, 125, 80, 30);
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setActionCommand(button2.getText());
        panel.add(button2);
        
        button3 = new JButton("Kali");
        button3.setBounds(150, 155, 80, 30);
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setActionCommand(button3.getText());
        panel.add(button3);
        
        button4 = new JButton("Bagi");
        button4.setBounds(230, 155, 80, 30);
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setActionCommand(button4.getText());
        panel.add(button4);
        
        
        frame.add(panel);
        frame.setVisible(true);
   }
     
    
    @Override
     public void actionPerformed(ActionEvent event) {
         try {
             bilangan1 = Double.parseDouble(pesan1.getText());
             bilangan2 = Double.parseDouble(pesan2.getText());
             
             String button = event.getActionCommand();
             double jawab = 0;
             
             switch(button) {
                 case "Jumlah":
                    jawab = bilangan1+bilangan2;
                    break;
                 case "Kurang":
                    jawab = bilangan1-bilangan2;
                    break;
                 case "Kali":
                    jawab = bilangan1*bilangan2;
                    break;
                 case "Bagi":
                    jawab = bilangan1/bilangan2;
                    break;
             }
             hasil.setText(jawab+" ");
         }catch(NumberFormatException error) {
             JOptionPane.showMessageDialog(null, "Mohon Masukkan angka");
         }
    }
    
}