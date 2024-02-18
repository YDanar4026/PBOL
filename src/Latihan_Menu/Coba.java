/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan_Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Coba {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu inputMenu = new JMenu("Input");
        JMenuItem tambahManagerMenuItem = new JMenuItem("Tambah Manager");
        inputMenu.add(tambahManagerMenuItem);

        JMenuItem tambahMarketingMenuItem = new JMenuItem("Tambah Marketing");
        inputMenu.add(tambahMarketingMenuItem);

        JMenuItem tambahHonorerMenuItem = new JMenuItem("Tambah Honorer");
        inputMenu.add(tambahHonorerMenuItem);

        menuBar.add(inputMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
