/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Latihan_4 extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button1, button2;
    private JTextField pesan;
    
    public static void main(String[] args) {
        Latihan_4 frame = new Latihan_4();
        frame.setVisible(true);
    }
    
    public Latihan_4() {

        Container contentPane = getContentPane( );
        contentPane.setLayout(new FlowLayout());

        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setResizable ( false );
        setTitle     ( "Program Ch7JButtonFrame" );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );

        button1 = new JButton("Click Me");
        button1.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button1);
        button2 = new JButton("Tombol 2");
        button2.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button2);
        
        pesan = new JTextField();
        pesan.setColumns(20);
        contentPane.add(pesan);
        
        Listener listen = new Listener();
        button1.addActionListener(this);
        button2.addActionListener(this);

        setDefaultCloseOperation( EXIT_ON_CLOSE );
   }
    
    @Override
     public void actionPerformed(ActionEvent event) {

        JButton clickedButton = (JButton) event.getSource();

        JRootPane rootPane = clickedButton.getRootPane( );
        Frame     frame    = (JFrame) rootPane.getParent();

        // JFrame frame = (JFrame) clickedButton.getRootPane().getParent();
        
        String  buttonText = clickedButton.getText();
        
        if (buttonText.equals("Click Me")) {
            String isiPesan = pesan.getText();
            frame.setTitle(isiPesan);
        } else { 
        frame.setTitle("You clicked " + buttonText);
        } 
    }
     
}