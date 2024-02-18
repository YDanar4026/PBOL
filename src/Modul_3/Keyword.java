/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Keyword extends JFrame {
    
    public Keyword() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Find");
        this.setVisible(true);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JTextField text = new JTextField(25);
        JButton tombol = new JButton();
        
        label.setText("Keyword");
        tombol.setText("Find");
        
        panel.add(label);
        panel.add(text);
        panel.add(tombol);
        
        this.add(panel);
    }

    public static void main(String[] args) {
        new Keyword();
    }
}
