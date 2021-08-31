package com.example.paskontakview;
public class Model {
    private String judul;
    private String tanggal;
    private String gambar;
    private String deskripsi;
    public Model(String judul, String tanggal, String gambar, String deskripsi) {
        this.judul = judul;
        this.tanggal = tanggal;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }
    public String getDeskripsi() { return deskripsi; }

    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
