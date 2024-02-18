/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class warna1 extends JFrame{

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public warna1() {
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (true);
        setTitle ("GUI Event Warna");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setVisible(true);
        
        JPanel panel;
        JButton tombol1, tombol2;
        panel = new JPanel();
        
        tombol1 = new JButton("Merah");
        tombol1.setBounds(250, 500, 100, 50);
        tombol1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.red);
            add(panel);
            }
        });
        
        tombol2 = new JButton("Kuning");
        tombol2.setBounds(300, 500, 100, 50);
        tombol2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.yellow);
            add(panel);
            }
        });
        
        panel.add(tombol1);
        panel.add(tombol2);
        add(panel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new warna1();
    }
}
