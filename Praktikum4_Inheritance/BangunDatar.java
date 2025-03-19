// nama file : BangunDatar.java
// deskripsi : buat kode program Bangun Datar
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // konstruktor
    public BangunDatar() {

    }
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    // selektor
    public int getJmlSisi() {
        return jmlSisi;
    }
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    public String getWarna() {
        return warna;
    }
    public String getBorder() {
        return border;
    }

    // mutator
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setBorder(String border) {
        this.border = border;
    }

    // method laiin

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }
}
