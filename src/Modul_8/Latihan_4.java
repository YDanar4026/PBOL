/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

public class Latihan_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Kalimat 1: ");
        String kalimat1 = scan.nextLine();

        System.out.print("Kalimat 2: ");
        String kalimat2 = scan.nextLine();

        String hasilGabungan = kalimat1 + " " + kalimat2;

        System.out.println("Output: " + hasilGabungan);

        scan.close();
        
    }
}
