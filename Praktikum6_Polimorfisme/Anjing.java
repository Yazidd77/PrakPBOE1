// nama file : Anjing.java
// deskripsi : kode anak dari anabul (Anjing)
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 27 april 2025
public class Anjing extends Anabul {
    public Anjing(String nama){
        super(nama);
    }

    @Override
    public String gerak(){
        return "melata";
    }
    @Override
    public String bersuara(){
        return "guk-guk";
    }
    
}
