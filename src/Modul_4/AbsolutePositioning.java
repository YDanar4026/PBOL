/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_4;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AbsolutePositioning extends JFrame {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 20;
    private JButton cancelButton;
    private JButton okButton;
    private JTextField txtField;
    
    public static void main(String[] args) {
        AbsolutePositioning frame = new AbsolutePositioning();
        frame.setVisible(true);
    }
    
    public AbsolutePositioning() {
        Container contentPane = getContentPane();
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (true);
        setTitle ("Program AbsolutePositioning");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        okButton = new JButton("OK");
        okButton.setBounds(100, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(200, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        
        JLabel label1 = new JLabel("Nama");
        label1.setBounds(10, 20, 80, 20);
        contentPane.add(label1);
        txtField = new JTextField(20);
        txtField.setBounds(120, 20, 200, 20);
        contentPane.add(txtField);
        
        JLabel label2 = new JLabel("Kelamin");
        label2.setBounds(10, 60, 100, 20);
        contentPane.add(label2);
        JRadioButton radio1 = new JRadioButton();
        radio1.setText("Laki-laki");
        radio1.setBounds(120,60,100,20);
        contentPane.add(radio1);
        JRadioButton radio2 = new JRadioButton();
        radio2.setText("Perempuan");
        radio2.setBounds(220,60,100,20);
        contentPane.add(radio2);
        
        JLabel label3 = new JLabel("Hobi");
        label3.setBounds(10, 100, 80, 20);
        contentPane.add(label3);
        JCheckBox check1 = new JCheckBox();
        check1.setText("Olahraga");
        check1.setBounds(120, 100, 150, 20);
        contentPane.add(check1);
        JCheckBox check2 = new JCheckBox();
        check2.setText("Shopping");
        check2.setBounds(120, 120, 150, 20);
        contentPane.add(check2);
        JCheckBox check3 = new JCheckBox();
        check3.setText("Computer Games");
        check3.setBounds(120, 140, 150, 20);
        contentPane.add(check3);
        JCheckBox check4 = new JCheckBox();
        check4.setText("Nonton Bioskop");
        check4.setBounds(120, 160, 150, 20);
        contentPane.add(check4);
        
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
    
}
