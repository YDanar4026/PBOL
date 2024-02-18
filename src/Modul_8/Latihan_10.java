/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Latihan_10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = s.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(kalimat);

        int jumlahKata = tokenizer.countTokens();

        System.out.println("Jumlah kata: " + jumlahKata + " kata");

        s.close();
        
    }
}
