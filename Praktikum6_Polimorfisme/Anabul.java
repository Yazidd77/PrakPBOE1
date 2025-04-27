// nama file : Anabul.java
// deskripsi : kode induk
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 27 april 2025

abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public abstract String gerak();

    public abstract String bersuara();
}