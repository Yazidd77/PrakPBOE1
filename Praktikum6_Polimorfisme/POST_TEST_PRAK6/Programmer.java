// nama file : Programmer.java
// deskripsi : kode untuk class Programmer
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 24 april 2025
public class Programmer extends Pegawai {
    private final int bonus = 450000;

    public Programmer(String nama){
    setNama(nama);
}

public void tampilData(){
    super.tampilData();
    System.out.println("Tunjangan : " + bonus);

}
}
