/* Nama file  : LabNonKomputer.java
 * Deskripsi  : berisi implementasi class untuk Lab Non komputer
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public class LabNonKomputer extends RuangLaboratorium {
    /* -------------------Atribut------------------- */
    private String[] mataKuliah;
    private static int jumlahLabNonKomputer = 0;
    
     /* -------------------Method------------------- */
    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                         String namaLab, double hargaSewa, String[] mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
        jumlahLabNonKomputer++;
    }
    
    
    public String[] getMataKuliah() {
        return mataKuliah;
    }
    
    public void setMataKuliah(String[] mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    
    public static int getJumlahLabNonKomputer() {
        return jumlahLabNonKomputer;
    }
    
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kategori: Lab Non-Komputer");
        System.out.println("Mata Kuliah yang Dihandle:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
    }
}

