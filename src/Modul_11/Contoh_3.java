/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_11;

public class Contoh_3 implements Runnable{

    @Override
    public void run() {
        for (int x = 1; x <= 5; x++) {
            try {
                System.out.println("Angka "+x);
                Thread.sleep(1000);
            } catch (Exception exc) {
                System.out.println("Pesan Error : "+exc.getMessage());
            }
        }
    }
     
    public static void main(String[] args) {
        Contoh_3 out = new Contoh_3();
        
        Thread td = new Thread(out);
        td.start();
    } 
}
