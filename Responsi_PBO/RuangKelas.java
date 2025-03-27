/* Nama file  : RuangKelas.java
 * Deskripsi  : berisi implementasi class untuk Ruang Kelas
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public class RuangKelas extends RuangFakultas {
    /* -------------------Atribut------------------- */
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    private static int jumlahRuangKelas = 0;
    
   /* -------------------Method------------------- */
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                     int jumlahKursiTersedia, int jumlahKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
        jumlahRuangKelas++;
    }
    
    
    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }
    
    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }
    
    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }
    
    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }
    
    
    public static int getJumlahRuangKelas() {
        return jumlahRuangKelas;
    }
    
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: Ruang Kelas");
        System.out.println("Jumlah Kursi Tersedia: " + jumlahKursiTersedia);
        System.out.println("Jumlah Kursi Rusak: " + jumlahKursiRusak);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}
