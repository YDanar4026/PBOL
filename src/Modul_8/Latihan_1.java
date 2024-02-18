/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

public class Latihan_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Karakter-1 : ");
        String k1 = sc.next();
        System.out.println("Karakter-2 : ");
        String k2 = sc.next();
        
        if (k1.compareTo(k2) > 0) {
            System.out.println("Karakter pertama lebih besar dari pada karakter 2");
        } else if (k1.compareTo(k2) < 0) {
            System.out.println("Karakter pertama lebih kecil dari pada karakter 2");
        } else {
            System.out.println("Kedua karakter adalah sama");
        }
        
    }
}
