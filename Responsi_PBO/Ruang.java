/* Nama file  : Ruang.java
 * Deskripsi  : berisi implementasi class untuk Ruang
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public class Ruang {
    /* -------------------Atribut------------------- */
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;
    
     /* -------------------Method------------------- */
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }
    
    
    public String getKode() {
        return kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public int getKapasitas() {
        return kapasitas;
    }
    
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
    
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    
    public void tampilkanInfo() {
        System.out.println("Kode Ruang: " + kode);
        System.out.println("Dimensi: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Kapasitas: " + kapasitas + " orang");
        System.out.println("Luas: " + hitungLuas() + " m²");
    }
    
   
    public double hitungBiayaKebersihan() {
        return 0; 
    }
}