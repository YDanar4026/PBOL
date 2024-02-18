/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_6;

import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1 = 0, bilangan2 = 0;
        boolean errorCheck;
        do {
            try {
                System.out.print("Masukkan bilangan 1: ");
                bilangan1 = input.nextInt();
                errorCheck = false;
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input, mohon diulangi!");
                errorCheck = true;
                input.next();
            }
        } while (errorCheck);
        
        do {
            try {
                System.out.print("Masukkan bilangan 2: ");
                bilangan2 = input.nextInt();
                errorCheck = false;
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input, mohon diulangi!");
                errorCheck = true;
                input.next();
            }
        } while (errorCheck);
        
        System.out.println("Hasil penjumlahan kedua bilangan itu: " +(bilangan1+bilangan2));
    }
}
