/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Mobil;
import db.Mysql;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author adehe
 */
public class MobilDao {
    public List<Mobil> findAll() {
        List<Mobil> list_mobil = new ArrayList<>();
        
        try {
            String sql = "select id, nama, bahan_bakar, jumlah_silinder, kapasitas_silinder, jumlah_kursi from mobil";
            Connection con = Mysql.GetConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                int id                  = rs.getInt("id");
                String nama             = rs.getString("nama");
                String bahan_bakar      = rs.getString("bahan_bakar");
                int jumlah_silinder     = rs.getInt("jumlah_silinder");
                int kapasitas_silinder  = rs.getInt("kapasitas_silinder");
                int jumlah_kursi        = rs.getInt("jumlah_kursi");
                
                Mobil mobil = new Mobil(id, nama, bahan_bakar, jumlah_silinder, kapasitas_silinder, jumlah_kursi);
                list_mobil.add(mobil);
            }
            
            st.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return list_mobil;
    }
    
    public boolean save(Mobil mobil) {
        boolean row_inserted = false;
        
        try {
            String sql = "insert into mobil(nama, bahan_bakar, jumlah_silinder, kapasitas_silinder, jumlah_kursi) "
                    + "   values(?, ?, ?, ?, ?)";
            Connection con = Mysql.GetConnection();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, mobil.getNama());
            st.setString(2, mobil.getBahanBakar());
            st.setInt(3, mobil.getJumlahSilinder());;
            st.setInt(4, mobil.getKapasitasSilinder());
            st.setInt(5, mobil.getJumlahKursi());
            row_inserted = st.executeUpdate() > 0;
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return row_inserted;
    }
}
