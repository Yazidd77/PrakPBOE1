// nama file : kucing.java
// deskripsi : kode anak dari anabul (kucing)
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 27 april 2025
public class Kucing extends Anabul {

    public Kucing(String nama){
        super(nama);
    }

    @Override
    public String gerak() {
        return "melata";
    }
    @Override
    public String bersuara(){
        return "meong";
    }
    
}


