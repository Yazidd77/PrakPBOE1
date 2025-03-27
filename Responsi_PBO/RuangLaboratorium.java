/* Nama file  : RuangLaboratorium.java
 * Deskripsi  : berisi implementasi class untuk Ruang Laboratorium
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public abstract class RuangLaboratorium extends RuangFakultas {
    /* -------------------Atribut------------------- */
    private String namaLab;
    private double hargaSewa;
    private static int jumlahRuangLab = 0;

     /* -------------------Method------------------- */
    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                           String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        jumlahRuangLab++;
    }
    
    
    public String getNamaLab() {
        return namaLab;
    }
    
    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }
    
    public double getHargaSewa() {
        return hargaSewa;
    }
    
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    
    public static int getJumlahRuangLab() {
        return jumlahRuangLab;
    }
    
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Lab: " + namaLab);
        System.out.println("Harga Sewa: Rp " + hargaSewa);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}
