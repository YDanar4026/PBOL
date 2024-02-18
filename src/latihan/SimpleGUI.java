/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends javax.swing.JFrame
        implements java.awt.event.ActionListener
{
    private JLabel numberOfClicksLabel;
    private int numberOfClicks=0;
    private JButton swingButton;
    
    /** Creates a new instance of SimpleGUI */
    public SimpleGUI() {
        //instance label and button
        super("SwingApplication");
        numberOfClicksLabel = new JLabel("Number of button clicks: "+getNumberOfClicks());
        swingButton = new JButton("I'm swing button");
        
        this.setLayout(new FlowLayout());
        this.add(swingButton);
        this.add(numberOfClicksLabel);
        
        swingButton.addActionListener(this);
    }

    public int getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }
    
    public void actionPerformed(ActionEvent e) {  
        setNumberOfClicks(getNumberOfClicks()+1);
        numberOfClicksLabel.setText("Number of button clicks: "+getNumberOfClicks());        
   }
    
    public static void main(String[] args) {
        SimpleGUI simpleGUI = new SimpleGUI();
        simpleGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleGUI.setSize(200,100);
        simpleGUI.setVisible(true);

    }
}
