/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButtonFrameHandler extends JFrame implements ActionListener {

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH    = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT   = 200;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * Default width for buttons
     */
    private static final int BUTTON_WIDTH  = 80;

    /**
     * Default height for buttons
     */
    private static final int BUTTON_HEIGHT = 30;

    /**
     * The Swing button for Cancel
     */
    private JButton cancelButton;


    /**
     * The Swing button for OK
     */
    private JButton okButton;
    
    public static void main(String[] args) {
        JButtonFrameHandler frame = new JButtonFrameHandler();
        frame.setVisible(true);
    }
    
    public JButtonFrameHandler() {

        Container contentPane = getContentPane( );

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Program Ch14JButtonFrameHandler");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //set the content pane properties
        contentPane.setLayout(new FlowLayout());
        //contentPane.setBackground(Color.white);

        //create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
      //  okButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
                //Note: setSize does not have an effect with
               //      when a layout manager is used.
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
      //  cancelButton.setBounds(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

        //registering this frame as an action listener of the two buttons
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
   }
    
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();

        String  buttonText = clickedButton.getText();

        this.setTitle("You clicked " + buttonText);
    }
    
}
