/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

public class Latihan_8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input kata: ");
        String kata = s.nextLine();

        StringBuffer reversedKata = new StringBuffer(kata).reverse();

        System.out.println("Reverse kata: " + reversedKata);

        if (kata.equals(reversedKata.toString())) {
            System.out.println("Status: Palindrome");
        } else {
            System.out.println("Status: Bukan Palindrome");
        }

        s.close();
        
    }
}
