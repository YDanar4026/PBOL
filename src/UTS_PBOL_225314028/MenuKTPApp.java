/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_PBOL_225314028;

import javax.swing.*;
import java.awt.event.*;

public class MenuKTPApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi KTP");
        JMenuBar menuBar = new JMenuBar();
        JMenu programMenu = new JMenu("Program");
        JMenuItem ktpSubMenu = new JMenuItem("KTP");
        JMenuItem keluarSubMenu = new JMenuItem("Keluar");

        ktpSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FormInputKTPApp.showForm();
            }
        });

        keluarSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        programMenu.add(ktpSubMenu);
        programMenu.add(keluarSubMenu);
        menuBar.add(programMenu);
        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
