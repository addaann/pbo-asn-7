/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adehe
 */
public class Mobil {
    private int id;
    private String nama;
    private String bahan_bakar;
    private Mesin mesin = new Mesin();
    private int jumlah_kursi;
    
    public Mobil(int id, String nama, String bahan_bakar, int jumlah_silinder, int kapasitas_silinder, int jumlah_kursi) {
        this.id = id;
        this.nama = nama;
        this.bahan_bakar = bahan_bakar;
        this.mesin.jumlah_silinder = jumlah_silinder;
        this.mesin.kapasitas_silinder = kapasitas_silinder;
        this.jumlah_kursi = jumlah_kursi;
    }
    
    public Mobil(String nama, String bahan_bakar, int jumlah_silinder, int kapasitas_silinder, int jumlah_kursi) {
        this.nama = nama;
        this.bahan_bakar = bahan_bakar;
        this.mesin.jumlah_silinder = jumlah_silinder;
        this.mesin.kapasitas_silinder = kapasitas_silinder;
        this.jumlah_kursi = jumlah_kursi;
    }
    
    public Mobil() {}
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setBahanBakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    }
    
    public void setJumlahSilinder(int jumlah_silinder) {
        this.mesin.jumlah_silinder = jumlah_silinder;
    }
    
    public void setKapasitasSilinder(int kapasitas_silinder) {
        this.mesin.kapasitas_silinder = kapasitas_silinder;
    }
    
    public void setJumlahKursi(int jumlah_kursi) {
        this.jumlah_kursi = jumlah_kursi;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getBahanBakar() {
        return this.bahan_bakar;
    }
    
    public int getJumlahSilinder() {
        return this.mesin.jumlah_silinder;
    }
    
    public int getKapasitasSilinder() {
        return this.mesin.kapasitas_silinder;
    }
    
    public int getJumlahKursi() {
        return this.jumlah_kursi;
    }
}