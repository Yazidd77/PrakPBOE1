// nama file : Burung.java
// deskripsi : kode anak dari anabul (Burung)
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 27 april 2025
public class Burung extends Anabul {
    public Burung(String nama){
        super(nama);
    }

    @Override
    public String gerak(){
        return "terbang";

    }
    @Override
    public String bersuara(){
        return "cuit";
    }
    
}
