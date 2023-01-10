/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptoko;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ACER
 */
public class koneksi {
 public static Connection con;
 public static Statement stm;
 public static void config() {
 try {
 String url = "jdbc:mysql://localhost/db_toko";
 String user = "root";
 String pass = "";
 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection(url, user, pass);
 stm = (Statement) con.createStatement();
 System.out.println("Koneksi Berhasil");
 } catch (Exception e) {
 System.out.println("Koneksi Gagal");
 }
 }
}
