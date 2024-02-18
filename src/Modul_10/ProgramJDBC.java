/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_10;

import java.sql.*;
import java.util.Scanner;

public class ProgramJDBC {

    public static void main(String[] args) {
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("=====================");
        
        System.out.println("Mencoba membuat koneksi ke database.......");
        ProgramJDBC p = new ProgramJDBC();
        Connection conn = p.getConnection();
        
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Menu:");
        System.out.println("1. Lihat Isi Tabel");
        System.out.println("2. Tambah Data");
        System.out.println("3. Hapus 1 Data");
        System.out.println("4. Update Data");
        System.out.println("5. Keluar");
        int input = 0;
        while (input != 5) {
            System.out.println("Pilih Menu?");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            switch (input) {
                case 1:
                    p.showData();
                    break;
                case 2:
                    p.inputData();
                    break;
                case 3:
                    p.hapusData();
                    break;
                case 4:
                    p.updateData();
                    break;
                default:
                    break;
            }
        }
        
    }
    
    
    
    public Connection getConnection() {
        String host = "localhost";
        String port = "1521";
        String db = "xe";
        String usr = "hr";
        String pwd = "danar5567622232";
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+port+":"+db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf, koneksi tidak berhasil");
            System.out.println(ex.getMessage());
        }
        if (conn != null) {
            System.out.println("Koneksi ke database berhasil terbentuk");
        } else {
            System.out.println("Maaf, koneksi ke database gagal terbentuk");
        }
        return conn;
    }
    
    
    
    public void showData() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        System.out.println("");
        conn = this.getConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from mahasiswa");
            
            System.out.println("Nim\t\tNama\t\t\tIPK");
            while (rs.next()) {
                System.out.println(rs.getString(1)+" "
                                    +"\t"+rs.getString(2)+"\t\t\t"+rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    
    
    public void inputData() {
        Connection conn = null;
        PreparedStatement ps = null;
        
        conn = this.getConnection();
        
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT DATA");
        System.out.print("Masukkan NIM: ");
        String nim = sc.next();
        System.out.print("Masukkan NAMA: ");
        String nama = sc.next();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        
        try {
            ps = conn.prepareStatement("insert into mahasiswa values(?,?,?)");
            ps.setString(1, nim);
            ps.setString(2, nama);
            ps.setDouble(3, ipk);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah ditambahkan!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    
    
    public void hapusData() {
        Connection conn = null;
        PreparedStatement ps = null;
        
        conn = this.getConnection();
        
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("DELETE DATA");
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = sc.next();
        
        try {
            ps = conn.prepareStatement("delete from mahasiswa where nim = ?");
            ps.setString(1, nim);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah dihapus!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    
    
    
    public void updateData() {
        Connection con = null;

        PreparedStatement ps = null;
        
        System.out.println("");
        con = this.getConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("UPDATE  DATA");
        System.out.print("Masukkan NIM  yang akan di update: ");
        int nim = sc.nextInt();
        System.out.print("Masukkan koreksi NAMA : ");
        String nama = sc.next();
        System.out.print("Masukkan koreksi IPK: ");
        double ipk = sc.nextDouble();

        try {
            ps = con.prepareStatement("update mahasiswa set nama = ? , ipk = ?  where  nim = ?");
            ps.setString(1, nama);
            ps.setDouble(2, ipk);
            ps.setInt(3, nim);
            ps.executeUpdate();
            con.commit();
            System.out.println("Data sudah diupdate");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
