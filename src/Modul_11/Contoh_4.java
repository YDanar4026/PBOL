/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_11;

public class Contoh_4 {

    public static void main(String[] args) {
        Thread out = new Thread(new Runnable() {
            @Override
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
        });
        out.start();
    }
}
