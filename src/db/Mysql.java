/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.io.*;
import java.sql.*;

/**
 *
 * @author adehe
 */
public class Mysql {
    private static Connection con = null;
    private final static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private final static String url = "jdbc:mysql://localhost:3306/kendaraan?useSSL=false";
    private final static String user = "root";
    private final static String pswd = "root";
    
    public static Connection GetConnection() {
        if(con == null) {
            try {
//                Class.forName(jdbcDriver);
Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Mencoba membangun koneksi ....");
                con = DriverManager.getConnection(url, user, pswd);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        if(con != null) System.out.println("Koneksi berhasil !");
        return con;
    }
    
    public static void CloseConnection() {
        try {
            System.out.println("Menutup koneksi...");
            con.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
