/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_PBOL_225314028;

import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormInputKTPApp {
    private static JTextField namaField;
    private static JComboBox<String> tanggalLahirField, bulanLahirField, tahunLahirField;
    private static JTextArea alamatArea;

    public static void showForm() {
        JFrame frame = new JFrame("Form Input KTP");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel namaLabel = new JLabel("Nama:");
        namaLabel.setBounds(20, 20, 80, 30);
        namaField = new JTextField(20);
        namaField.setBounds(120, 20, 200, 30);

        JLabel tanggalLabel = new JLabel("Tanggal Lahir:");
        tanggalLabel.setBounds(20, 60, 100, 30);
        tanggalLahirField = new JComboBox<>();
        tanggalLahirField.setBounds(120, 60, 50, 30);
        for (int i = 1; i <= 31; i++) {
            tanggalLahirField.addItem(String.valueOf(i));
        }

        bulanLahirField = new JComboBox<>();
        bulanLahirField.setBounds(180, 60, 50, 30);
        for (int i = 1; i <= 12; i++) {
            bulanLahirField.addItem(String.valueOf(i));
        }

        tahunLahirField = new JComboBox<>();
        tahunLahirField.setBounds(240, 60, 100, 30);
        for (int i = 1990; i <= 2014; i++) {
            tahunLahirField.addItem(String.valueOf(i));
        }

        JLabel alamatLabel = new JLabel("Alamat:");
        alamatLabel.setBounds(20, 100, 80, 30);
        alamatArea = new JTextArea(5, 20); 
        alamatArea.setLineWrap(true);
        alamatArea.setBounds(120, 100, 240, 100);

        JButton tambahButton = new JButton("Tambah");
        tambahButton.setBounds(20, 220, 100, 30);

       tambahButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            String nama = namaField.getText();
            int tanggal = Integer.parseInt((String) tanggalLahirField.getSelectedItem());
            int bulan = Integer.parseInt((String) bulanLahirField.getSelectedItem());
            int tahun = Integer.parseInt((String) tahunLahirField.getSelectedItem());
            String alamat = alamatArea.getText();

            if (nama.isEmpty() || alamat.isEmpty()) {
                throw new Exception("Nama dan alamat harus diisi.");
            }

            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = dateFormat.parse(tanggal + "/" + bulan + "/" + tahun);

            Calendar birthCal = Calendar.getInstance();
            birthCal.setTime(birthDate);
            Calendar currentCal = Calendar.getInstance();
            currentCal.setTime(currentDate);

            int ageInYears = currentCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);

            if (currentCal.get(Calendar.MONTH) < birthCal.get(Calendar.MONTH)
                    || (currentCal.get(Calendar.MONTH) == birthCal.get(Calendar.MONTH)
                            && currentCal.get(Calendar.DAY_OF_MONTH) < birthCal.get(Calendar.DAY_OF_MONTH))) {
                ageInYears--;
            }

            String info = "Nama: " + nama + "\nTanggal Lahir: " + tanggal + "/" + bulan + "/" + tahun
                    + "\nUmur: " + ageInYears + " tahun\nAlamat: " + alamat;

            JOptionPane.showMessageDialog(null, info, "Informasi KTP", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});

        panel.add(namaLabel);
        panel.add(namaField);
        panel.add(tanggalLabel);
        panel.add(tanggalLahirField);
        panel.add(bulanLahirField);
        panel.add(tahunLahirField);
        panel.add(alamatLabel);
        panel.add(alamatArea);
        panel.add(tambahButton);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        showForm();
        
    }
}
