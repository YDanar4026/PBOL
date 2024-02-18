/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.*;

public class Koneksi {

    public Connection getKoneksi() {
        String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "hr";
        String password = "danar5567622232";
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("Koneksi berhasil");
            return conn;
        } catch (Exception e) {
            // perform error handling here
            System.out.println(e.getMessage());
        }
        return null;
    }


    public static void main(String[] args){
//        String jdbcURL = "jdbc:mysql://localhost:3306/informatika";
//        String user = "root";
//        String password = "";
//        Koneksi conn = null;
        Connection connection = null;
        Statement stats = null;
        ResultSet s = null;
        
        Koneksi koneksi = new Koneksi();
        koneksi.getKoneksi();
        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection(jdbcURL, user, password);
//            System.out.println("Koneksi berhasil");
//            
////            String deleteStr = "DELETE FROM detailjadwal WHERE id = '1'";
//
////            Statement stmt = conn.createStatement();
////            int delnum = stmt.executeUpdate(deleteStr);
////            System.out.println("Status "+delnum);
//
//            String queryStr = "SELECT * "
//                    + " FROM mahasiswa  ";
////
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(queryStr);
//            rs.next();
//            while(rs.next()) {
//                String nim = rs.getString("nim");
//                String nama = rs.getString("nama");
//                rs.getString("sks");
//                
////                String nim = rs.getString(2);
////                String nama = rs.getString(3);
//                
//                System.out.println("NIM "+nim);
//                System.out.println("Nama "+nama);
//            }
//
//             rs.close();
//             stmt.close();
//             conn.close();
//        } catch (Exception e) {
//            // perform error handling here
//            System.out.println(e.getMessage());
//        }
     }  
}

