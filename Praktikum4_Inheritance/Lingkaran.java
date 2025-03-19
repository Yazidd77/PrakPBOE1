// nama file : Lingkaran.java
// deskripsi : buat kode program Lingkaran
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025

public class Lingkaran extends BangunDatar{
    private double jari;

    // konstruktor 
    public Lingkaran(){
        setJmlSisi(0);
    }

    // getter
    public double getJari(){
        return jari;
    } 

    // setter
    public void setJari(double jari){
        this.jari = jari;
    }

    // method lain
    public double getLuas(){
        return (Math.PI)*jari*jari;
    }
    public double getKeliling(){
        return 2*(Math.PI)*jari;
    }

}