/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_COBA;

public class Masyarakat extends Penduduk implements Peserta {
    private String nomor;

    public Masyarakat() {
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    @Override
    public double hitungIuran() {
        return Double.parseDouble(nomor) * 100;
    }

    @Override
    public String getJenisSertifikat() {
        return "Sertifikat Peserta";
    }

    @Override
    public String getFasilitas() {
        return "Block note, alat tulis, modul pelatihan";
    }

    @Override
    public String getKonsumsi() {
        return "Snack, makan siang";
    }
    
}
