// nama file : Manager.java
// deskripsi : kode untuk class Manager
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 24 april 2025
public class Manager extends Pegawai {
    private final int tunjangan = 700000;

    public Manager(String nama){
        setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
    
}
