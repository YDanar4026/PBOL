/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul_2_COBA;

import java.util.Scanner;

public class Pengujian  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UKM ukm = new UKM();
        System.out.print("Masukkan nama UKM: ");
        String namaUKM = scanner.nextLine();
        ukm.setNamaUnit(namaUKM);

        Mahasiswa ketua = createMahasiswa(scanner, "Ketua");
        ukm.setKetua(ketua);

        Mahasiswa sekretaris = createMahasiswa(scanner, "Sekretaris");
        ukm.setSekretaris(sekretaris);

        System.out.print("Jumlah anggota UKM: ");
        int jumlahAnggota = scanner.nextInt();
        scanner.nextLine(); 
        Penduduk[] anggota = new Penduduk[jumlahAnggota];
        for (int i = 0; i < jumlahAnggota; i++) {
            System.out.print("Pilih jenis anggota (1 = Mahasiswa, 2 = Masyarakat): ");
            int jenisAnggota = scanner.nextInt();
            scanner.nextLine(); 

            if (jenisAnggota == 1) {
                anggota[i] = createMahasiswa(scanner, "Anggota Mahasiswa");
            } else if (jenisAnggota == 2) {
                anggota[i] = createMasyarakat(scanner, "Anggota Masyarakat");
            }
        }
        ukm.setAnggota(anggota);

        System.out.println("============================================================");
        System.out.println("Daftar Anggota UKM " + ukm.getNama() + ":");
        for (Penduduk anggotaUKM : ukm.getAnggota()) {
            System.out.println(anggotaUKM.getNama() + " - Iuran: " + anggotaUKM.hitungIuran());
        }

        double totalIuran = 0;
        for (Penduduk anggotaUKM : ukm.getAnggota()) {
            totalIuran += anggotaUKM.hitungIuran();
        }
        System.out.println("Total Iuran Anggota: " + totalIuran);

        System.out.println("Fasilitas Ketua UKM: " + ukm.getKetua().getFasilitas());
        System.out.println("Fasilitas Sekretaris UKM: " + ukm.getSekretaris().getFasilitas());

        for (Penduduk anggotaUKM : ukm.getAnggota()) {
            System.out.println("Fasilitas Anggota " + anggotaUKM.getNama() + ": " + anggotaUKM.getFasilitas());
        }

        System.out.println("Jenis Sertifikat Ketua UKM: " + ukm.getKetua().getJenisSertifikat());
        System.out.println("Jenis Sertifikat Sekretaris UKM: " + ukm.getSekretaris().getJenisSertifikat());

        for (Penduduk anggotaUKM : ukm.getAnggota()) {
            System.out.println("Jenis Sertifikat Anggota " + anggotaUKM.getNama() + ": " + anggotaUKM.getJenisSertifikat());
        }

        System.out.println("Konsumsi Ketua UKM: " + ukm.getKetua().getKonsumsi());
        System.out.println("Konsumsi Sekretaris UKM: " + ukm.getSekretaris().getKonsumsi());

        for (Penduduk anggotaUKM : ukm.getAnggota()) {
            System.out.println("Konsumsi Anggota " + anggotaUKM.getNama() + ": " + anggotaUKM.getKonsumsi());
        }

        scanner.close();
        System.out.println("============================================================");
    }

    private static Mahasiswa createMahasiswa(Scanner scanner, String role) {
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.print("Masukkan nama " + role + ": ");
        mahasiswa.setNama(scanner.nextLine());
        System.out.print("Masukkan NIM " + role + ": ");
        mahasiswa.setNim(scanner.nextLine());
        return mahasiswa;
    }

    private static Masyarakat createMasyarakat(Scanner scanner, String role) {
        Masyarakat masyarakat = new Masyarakat();
        System.out.print("Masukkan nama " + role + ": ");
        masyarakat.setNama(scanner.nextLine());
        System.out.print("Masukkan nomor " + role + ": ");
        masyarakat.setNomor(scanner.nextLine());
        return masyarakat;
    }
}

    

