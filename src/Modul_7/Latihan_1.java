/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int waktu = 0;
        
        try {
            System.out.print("Masukkan jarak perjalanan anda (km) : ");
            int jarak = sc.nextInt();
            System.out.print("Masukkan kecepatan kendaraan anda (km/jam) : ");
            int kecepatan = sc.nextInt();
            waktu = jarak/kecepatan;
        } catch (InputMismatchException e) {
            System.out.println("Maaf terjadi kesalahan input");
        } catch (ArithmeticException e) {
            System.out.println("Maaf terjadi proses kesalahan perhitungan");
        } finally {
            System.out.println("Waktu yang anda butuhkan adalah: "+waktu+" jam");
        }
        System.out.println("Terima Kasih");
        
    }
}
