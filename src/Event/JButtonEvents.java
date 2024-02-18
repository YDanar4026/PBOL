/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Event;

import javax.swing.*;
import java.awt.*;

public class JButtonEvents extends JFrame {
    
    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton cancelButton;
    private JButton okButton;
    
    public static void main(String[] args) {
        JButtonEvents frame = new JButtonEvents();
        frame.setVisible(true);
    }
    
    public JButtonEvents() {

        Container contentPane = getContentPane( );

        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Program JButtonEvents");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane.setLayout(new FlowLayout());
        //contentPane.setBackground(Color.white);

        okButton = new JButton("OK");
        //okButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
            //Note: setSize does not have an effect with
            //      when a layout manager is used.
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        //cancelButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

        ButtonHandler handler = new ButtonHandler();
        cancelButton.addActionListener(handler);
        okButton.addActionListener(handler);

        setDefaultCloseOperation( EXIT_ON_CLOSE );
   }
    
}
