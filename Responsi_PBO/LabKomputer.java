/* Nama file  : LabKomputer.java
 * Deskripsi  : berisi implementasi class untuk Lab Komputer
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */

public class LabKomputer extends RuangLaboratorium {
    /* -------------------Atribut------------------- */
    private int jumlahKomputer;
    private static int jumlahLabKomputer = 0;
    
     /* -------------------Method------------------- */
    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                      String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
        jumlahLabKomputer++;
    }
    
    
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }
    
    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }
    
    
    public static int getJumlahLabKomputer() {
        return jumlahLabKomputer;
    }
    
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kategori: Lab Komputer");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}


