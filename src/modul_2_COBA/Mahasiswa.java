/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_COBA;

public class Mahasiswa extends Penduduk implements Peserta {
    private String nim;

    public Mahasiswa() {
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public double hitungIuran() {
        return Double.parseDouble(nim) / 10000;
    }

    @Override
    public String getJenisSertifikat() {
        return "Sertifikat Panitia";
    }

    @Override
    public String getFasilitas() {
        return "Block note, alat tulis, laptop";
    }

    @Override
    public String getKonsumsi() {
        return "Snack, makan siang, makan malam";
    }
    
}
