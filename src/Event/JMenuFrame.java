/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuFrame extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JLabel response;
    private JMenu fileMenu;
    private JMenu editMenu;
    
    public static void main(String[] args) {
        JMenuFrame frame = new JMenuFrame();
        frame.setVisible(true);
    }
    
    public JMenuFrame() {

        Container contentPane;

        //set the frame properties
        setTitle("Ch14JMenuFrame");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //create two menus and their menu items
        createFileMenu();
        createEditMenu();

        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        //create and position reponse label
        response = new JLabel("Hello, this is your menu tester.");
        response.setSize(250, 50);
        contentPane.add(response);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event) {
        String menuName;

        menuName = event.getActionCommand();

        if (menuName.equals("Quit")) {
            System.exit(0);
        } else {
            response.setText("Menu Item '" + menuName + "' is selected.");
        }
    }
    
    private void createFileMenu() {
        JMenuItem item;

        fileMenu = new JMenu("File");

        item = new JMenuItem("Baru");        //New
        item.addActionListener(this);
        fileMenu.add(item);

        item = new JMenuItem("Open...");    //Open...
        item.addActionListener(this);
        fileMenu.add(item);

        item = new JMenuItem("Save");       //Save
        item.addActionListener(this);
        fileMenu.add(item);

        item = new JMenuItem("Save As..."); //Save As...
        item.addActionListener(this);
        fileMenu.add(item);

        fileMenu.addSeparator();           //add a horizontal separator line

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener(this);
        fileMenu.add(item);
    }

    /**
     * Create Edit menu and its menu items
     *
     */
    private void createEditMenu() {
        JMenuItem item;

        editMenu = new JMenu("Edit");

        item = new JMenuItem("Cut");      //Cut
        item.addActionListener(this);
        editMenu.add(item);

        item = new JMenuItem("Copy");    //Copy
        item.addActionListener(this);
        editMenu.add(item);

        item = new JMenuItem("Paste");    //Paste
        item.addActionListener(this);
        editMenu.add(item);
    }
    
}
