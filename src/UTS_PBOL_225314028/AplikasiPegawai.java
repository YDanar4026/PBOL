/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_PBOL_225314028;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiPegawai extends JFrame {
    private JTextField txtNIP;
    private JTextField txtNama;
    private JRadioButton rbLaki;
    private JRadioButton rbPerempuan;
    private JTextArea txtAlamat;

    public AplikasiPegawai() {
        setTitle("Aplikasi Pegawai");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel lblNIP = new JLabel("NIP");
        txtNIP = new JTextField();
        JLabel lblNama = new JLabel("Nama");
        txtNama = new JTextField();
        JLabel lblJenisKelamin = new JLabel("Jenis Kelamin");
        rbLaki = new JRadioButton("Laki-Laki");
        rbPerempuan = new JRadioButton("Perempuan");
        ButtonGroup jenisKelaminGroup = new ButtonGroup();
        jenisKelaminGroup.add(rbLaki);
        jenisKelaminGroup.add(rbPerempuan);
        JLabel lblAlamat = new JLabel("Alamat");
        txtAlamat = new JTextArea();

        panel.add(lblNIP);
        panel.add(txtNIP);
        panel.add(lblNama);
        panel.add(txtNama);
        panel.add(lblJenisKelamin);
        panel.add(rbLaki);
        panel.add(new JLabel()); 
        panel.add(rbPerempuan);
        panel.add(lblAlamat);
        panel.add(new JScrollPane(txtAlamat));

        JButton btnTambah = new JButton("Tambah");
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanInformasiPegawai();
            }
        });

        add(panel, BorderLayout.CENTER);
        add(btnTambah, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void tampilkanInformasiPegawai() {
        String nip = txtNIP.getText();
        String nama = txtNama.getText();
        String jenisKelamin = rbLaki.isSelected() ? "Laki-Laki" : "Perempuan";
        String alamat = txtAlamat.getText();

        String informasi = "Informasi Pegawai\nNIP: " + nip + "\nNama: " + nama + "\nJenis Kelamin: " + jenisKelamin + "\nAlamat:\n" + alamat;

        JOptionPane.showMessageDialog(this, informasi, "Informasi Pegawai", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPegawai();
            }
        });
        
    }
}
