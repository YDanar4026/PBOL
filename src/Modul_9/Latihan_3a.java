/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Latihan_3a {

    public static void main(String[] args) {
        FileInputStream inStream = null;
        
        File inFile = new File("ujicoba.txt");
        try {
            inStream = new FileInputStream(inFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        int fileSize = (int)inFile.length();
        byte[] byteArray = new byte[fileSize];
        try {
            inStream.read(byteArray);
            for (int i = 0; i < fileSize; i++) {
                System.out.print((char)byteArray[i]);
            }
            inStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
