// nama file : Pegawai.java
// deskripsi : kode untuk class Pegawai
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 24 april 2025
public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }

}