/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_COBA;

public class UKM {
    private String namaUnit;
    private Mahasiswa ketua;
    private Mahasiswa sekretaris;
    private Penduduk[] anggota;

    public UKM() {
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public void setKetua(Mahasiswa ketua) {
        this.ketua = ketua;
    }

    public void setSekretaris(Mahasiswa sekretaris) {
        this.sekretaris = sekretaris;
    }

    public void setAnggota(Penduduk[] anggota) {
        this.anggota = anggota;
    }

    public String getNama() {
        return namaUnit;
    }

    public Mahasiswa getKetua() {
        return ketua;
    }

    public Mahasiswa getSekretaris() {
        return sekretaris;
    }

    public Penduduk[] getAnggota() {
        return anggota;
    }

    double getFasilitasMahasiswaMasyarakat() {
        return 0;
    }

   double hitungIuranMahasiswaMasyarakat() {
        return 0;
    }
    
}
