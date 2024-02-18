/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_3;

import javax.swing.JFrame; 

public class TryWindow {

    public static void main(String[] args) {
        // The window object
        JFrame aWindow = new JFrame("This is the Window Title");
        int windowWidth = 400;
        int windowHeight = 150;
        aWindow.setBounds(50, 100,windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true); 
    }
}
