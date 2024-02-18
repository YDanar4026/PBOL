/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import java.io.File;

public class Latihan_1a {

    public static void main(String[] args) {
        File file = new File("sample.txt");
        if (!file.exists()) {
            System.out.println("Maaf file tidak ditemukan");
        } else {
            System.out.println("File ditemukan");
        }
        
    }
}
