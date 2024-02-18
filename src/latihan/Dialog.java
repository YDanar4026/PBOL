/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

import Latihan_Menu.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dialog extends JFrame {

    public Dialog() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bisnis");
        this.setVisible(true);
        
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JTextField text1 = new JTextField(15);
        JTextField text2 = new JTextField(15);
        JTextField text3 = new JTextField(15);
        //JButton tombol = new JButton();
        
        label1.setText("Manager");
        label2.setText("Pemasaran");
        label3.setText("Administrasi");
        //tombol.setText("Find");
        
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(label3);
        panel.add(text3);
        //panel.add(tombol);
        
        this.add(panel);
    }
    
    public static void main(String[] args) {
        new Dialog();
    }
}
