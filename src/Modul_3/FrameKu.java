/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_3;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrameKu extends JFrame {
    
    public FrameKu() {
        this.setSize(900, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini class turunan dari class JFrame");
        this.setVisible(true);
        
        JPanel panel = new JPanel();
        JButton tombol = new JButton();
        tombol.setText("Ini tombol");
        panel.add(tombol);
        
        JLabel label = new JLabel();
        label.setText("Ini label");
        panel.add(label);
        
        JTextField text = new JTextField();
        text.setText("Ini text field");
        panel.add(text);
        
        JCheckBox check = new JCheckBox();
        check.setText("Ini check box");
        panel.add(check);
        
        JRadioButton radio = new JRadioButton();
        radio.setText("Ini radio button");
        panel.add(radio);
        
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
       new FrameKu();
    }
}
