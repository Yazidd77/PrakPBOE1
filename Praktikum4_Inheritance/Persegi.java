// nama file : Persegi.java
// deskripsi : file kode program persegi
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025

public class Persegi extends BangunDatar {
    private double sisi;

    // konstruktor
    public Persegi() {
        setJmlSisi(4);
    }
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    // selektor
    public double getSisi() {
        return sisi;
    }

    // mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // method lain
    public double  getLuas(){
        return sisi*sisi;
    }
    public double getKeliling(){
        return 4*sisi;
    }
    public double  getDiagonal(){
        return (Math.sqrt(2))*sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
