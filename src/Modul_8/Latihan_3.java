/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

public class Latihan_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Posisi awal: ");
        int posisiAwal = scanner.nextInt();

        System.out.print("Posisi akhir: ");
        int posisiAkhir = scanner.nextInt();

        if (posisiAwal >= 1 && posisiAwal <= kalimat.length() && posisiAkhir >= posisiAwal && posisiAkhir <= kalimat.length()) {
            String output = kalimat.substring(posisiAwal - 1, posisiAkhir);

            System.out.println("Output: " + output);
        } else {
            System.out.println("Posisi awal dan/atau posisi akhir tidak valid.");
        }

        scanner.close();
        
    }
}
