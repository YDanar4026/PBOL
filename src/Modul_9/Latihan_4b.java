/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Latihan_4b {

    public static void main(String[] args) {
        FileOutputStream outStream = null;
        String info = "";

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan pesan yang ingin Anda simpan: ");
            info = scanner.nextLine();
            scanner.close();

            try {
                outStream = new FileOutputStream(filePath);
                outStream.write(info.getBytes());
                outStream.close();
                System.out.println("File berhasil disimpan di: " + filePath);
            } catch (FileNotFoundException ex) {
                System.out.println("File tidak ditemukan: " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("Terjadi kesalahan saat menulis file: " + ex.getMessage());
            }
        } else {
            System.out.println("Batal menyimpan file.");
        }
    }
}