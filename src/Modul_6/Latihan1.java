/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_6;

import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jarak perjalanan anda (Km) : ");
        int jarak = sc.nextInt();
        System.out.print("Masukkan banyaknya bensin yang dihabiskan (liter) : ");
        int liter = sc.nextInt();
        
        int konsumsi = jarak/liter;
        System.out.println("Konsumsi BBM anda adalah = " +konsumsi+ " Km/liter");
    }
}
