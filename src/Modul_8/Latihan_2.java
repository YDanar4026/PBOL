/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String inputKata = scan.nextLine();

        char[] karakter = inputKata.toCharArray();

        Arrays.sort(karakter);

        String hasil = new String(karakter);

        System.out.println("Input kata : " + inputKata);
        System.out.println("Urutan huruf: " + hasil);

        scan.close();
        
    }
}
