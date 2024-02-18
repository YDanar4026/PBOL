/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Latihan_4a {

    public static void main(String[] args) {
        FileOutputStream outStream = null;
        String info = "Ayo berlatih Stream!";
        
        File outFile = new File("ujicobaOutputStream.txt");
        try {
            outStream = new FileOutputStream(outFile);
            outStream.write(info.getBytes());
            outStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
