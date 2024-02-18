/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_6;

import javax.swing.*;

public class Latihan3 {

    public static void main(String[] args) {
        boolean errorCheck;
        int age = 0;
        do {
            try {
                String inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda : ");
                age = Integer.parseInt(inputStr);
                errorCheck = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Tolong masukkan angka");
                errorCheck = true;
            }
        } while (errorCheck);
        System.out.println("Umur anda : " +age+ " tahun");
    }
}
