/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_3;

import javax.swing.JFrame;

public class Frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ini frame pertamaku");
        
        int tinggi = 300;
        int lebar = 600;
        
        frame.setBounds(100,100,lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
