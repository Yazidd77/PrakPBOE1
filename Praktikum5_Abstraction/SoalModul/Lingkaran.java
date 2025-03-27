// nama file    : Lingkaran.java
// deskripsi    : program ini berisi class Lingkaran yang merupakan subclass dari superclass BangunDatar
// pembuat      : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal      : 20 Maret 2025
public class Lingkaran extends BangunDatar implements IResize{
    // ATRIBUT
    private double jari;

    // METHOD
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari; 
    }

    @Override
    public double getLuas(){
        return Math.PI * (jari * jari);
    }

    @Override
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom (int percent){
        jari = jari * percent / 100;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari   : " + jari);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
}