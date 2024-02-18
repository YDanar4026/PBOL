/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

public class Latihan_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input kata: ");
        String kata = s.nextLine();

        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            char karakterDiganti = karakter;

            switch (karakter) {
                case 'a':
                    karakterDiganti = '4';
                    break;
                case 'e':
                    karakterDiganti = '3';
                    break;
                case 'i':
                    karakterDiganti = '1';
                    break;
                case 'o':
                    karakterDiganti = '0';
                    break;
                case 'u':
                    karakterDiganti = '1';
                    hasil.append('1');
                    break;
            }

            hasil.append(karakterDiganti);
        }

        System.out.println("Output: " + hasil.toString());

        s.close();
        
    }
}
