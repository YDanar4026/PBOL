/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class Tugas_stream {

    public static void main(String[] args) {
        String inputFileName = "jawaban_mahasiswa.txt";
        String outputFileName = "E:/stream_1/nilai_mahasiswa.txt"; // Ubah lokasi penyimpanan di sini

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                String answerKey = line;
                String studentName = reader.readLine();
                String studentAnswers = reader.readLine();

                int correctAnswers = (int) Stream.iterate(0, i -> i + 1)
                        .limit(answerKey.length())
                        .filter(i -> answerKey.charAt(i) == studentAnswers.charAt(i))
                        .count();

                writer.write(studentName + " " + correctAnswers + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Perhitungan selesai. Hasil disimpan dalam " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
