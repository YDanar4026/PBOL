/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik_modul_2;

abstract class Penduduk {
    private String nama;
    private String tanggalLahir;

    public Penduduk() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public abstract double hitungIuran();

    String getJenisSertifikat() {
        return null;
    }

    String getFasilitas() {
        return null;
    }

    String getKonsumsi() {
        return null;
    }
    
}
