package com.example.paskontakview;
public class Data{
    private String judul, bahasa;
    private String gambar;
    public Data(String judul, String bahasa, String gambar) {
        this.judul = judul;
        this.bahasa = bahasa;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
