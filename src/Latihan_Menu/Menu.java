/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan_Menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {

    public Menu() {
        this.setTitle("Bisnis");
        this.setBounds(200, 200, 500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        JPanel panel = new JPanel();
        
        JMenuBar menuBar = new JMenuBar();
        panel.add(menuBar);
        
        JMenu menu = new JMenu();
        menu.setText("Menu");
        menuBar.add(menu);
        
        JMenuItem menuItem = new JMenuItem();
        menuItem.setText("Manager");
        menu.add(menuItem);
        
        menuItem = new JMenuItem();
        menuItem.setText("Marketing");
        menu.add(menuItem);
        
        menuItem = new JMenuItem();
        menuItem.setText("Honorer");
        menu.add(menuItem);
        
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        this.add(panel);
    }
    
    public static void main(String[] args) {
        new Menu();
//        JFrame frame = new JFrame("Menu");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//
//        JMenuBar menuBar = new JMenuBar();
//        JMenu inputMenu = new JMenu("Input");
//
//        JMenuItem tambahManagerMenuItem = new JMenuItem("Tambah Manager");
//        inputMenu.add(tambahManagerMenuItem);
//
//        JMenuItem tambahMarketingMenuItem = new JMenuItem("Tambah Marketing");
//        inputMenu.add(tambahMarketingMenuItem);
//
//        JMenuItem tambahHonorerMenuItem = new JMenuItem("Tambah Honorer");
//        inputMenu.add(tambahHonorerMenuItem);
//
//        menuBar.add(inputMenu);
//        frame.setJMenuBar(menuBar);
//
//        frame.setVisible(true);
    }
}
