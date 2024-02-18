/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan_2 {

    public static void main(String[] args) {
       int s = 0, v = 0, t = 0;
       
       try {
           Latihan_2 lat = new Latihan_2();
           s = lat.getJarak();
           v = lat.getKecepatan();
           t = lat.hitungWaktu(s,v);
       } catch (InputMismatchException e) {
            System.out.println("Maaf terjadi kesalahan input");
        } catch (ArithmeticException e) {
            System.out.println("Maaf terjadi kesalahan proses perhitungan");
        } finally {
            System.out.println("Waktu yang anda butuhkan adalah: "+t+" jam");
        }
        System.out.println("Terima Kasih");
    }
    
    public int getJarak() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak perjalanan anda (km) : ");
        int jarak = sc.nextInt();
        return jarak;
    }
    
    public int getKecepatan() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan kendaraan anda (km/jam) : ");
        int kecepatan = sc.nextInt();
        return kecepatan;
    }
    
    public int hitungWaktu ( int jarak, int kecepatan) throws ArithmeticException {
        int waktu = 0;
        waktu = jarak/kecepatan;
        return waktu;
    }
    
}
