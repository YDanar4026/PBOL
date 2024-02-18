/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Latihan_3b {

    public static void main(String[] args) {
        FileInputStream inStream = null;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                inStream = new FileInputStream(selectedFile);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

            int fileSize = (int) selectedFile.length();
            byte[] byteArray = new byte[fileSize];
            try {
                inStream.read(byteArray);
                for (int i = 0; i < fileSize; i++) {
                    System.out.print((char) byteArray[i]);
                }
                inStream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}