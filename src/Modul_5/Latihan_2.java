/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Latihan_2 extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button;
    
    public static void main(String[] args) {
        Latihan_2 frame = new Latihan_2();
        frame.setVisible(true);
    }
    
    public Latihan_2() {

        Container contentPane = getContentPane( );
        contentPane.setLayout(new FlowLayout());

        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setResizable ( false );
        setTitle     ( "Program Ch7JButtonFrame" );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );

        button = new JButton("Click Me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);

        Listener listen = new Listener();
        button.addActionListener(this);

        setDefaultCloseOperation( EXIT_ON_CLOSE );
   }
    
    @Override
     public void actionPerformed(ActionEvent event) {

        JButton clickedButton = (JButton) event.getSource();

        JRootPane rootPane = clickedButton.getRootPane( );
        Frame     frame    = (JFrame) rootPane.getParent();

        // JFrame frame = (JFrame) clickedButton.getRootPane().getParent();

        String  buttonText = clickedButton.getText();

        frame.setTitle("You clicked " + buttonText);
    }
    
}
