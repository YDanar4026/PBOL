/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_11;

public class Contoh_2 extends Thread {

    public void run() {
        try {
            for (int x = 1; x <= 5; x++) {
                System.out.println("Angka "+x);
                Thread.sleep(1000);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Contoh_2 out = new Contoh_2();
        Contoh_2 out2 = new Contoh_2();
        
        out.start();
        out2.start();
    }
}
