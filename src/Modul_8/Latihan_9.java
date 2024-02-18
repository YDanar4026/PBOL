/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Latihan_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan sebuah kalimat: ");
        String sentence = scanner.nextLine();
        
        StringTokenizer tokens = new StringTokenizer(sentence);
        
        System.out.println("Kalimat anda terdiri dari kata-kata berikut ini: ");
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
        
    }   
}
