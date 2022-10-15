package com.example.menumakanan;

public class Makanan {

    private String nama,harga,deskripsi,sebutan;
    private int id_gambar;


    public Makanan(String nama, String harga, String deskripsi, String sebutan, int id_gambar) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.sebutan = sebutan;
        this.id_gambar = id_gambar;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setAlamat(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getSebutan() {
        return sebutan;
    }

    public void setSebutan(String sebutan) {
        this.sebutan = sebutan;
    }

    public int getId_gambar() {
        return id_gambar;
    }

    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }

}
