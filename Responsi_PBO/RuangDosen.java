/* Nama file  : RuangDosen.java
 * Deskripsi  : berisi implementasi class untuk Ruang Dosen
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */

public class RuangDosen extends RuangDepartemen {
    /* -------------------Atribut------------------- */
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    private static int jumlahRuangDosen = 0;
    
    /* -------------------Method------------------- */
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                     Departemen departemen, String namaDosen, int jumlahKursi, int jumlahMeja) {
        super(kode, panjang, lebar, tinggi, kapasitas, departemen);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        jumlahRuangDosen++;
    }
    
   
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, 
                     Departemen departemen, String namaDosen) {
        this(kode, panjang, lebar, tinggi, 2, departemen, namaDosen, 2, 1);
        
    }
    
    
    public String getNamaDosen() {
        return namaDosen;
    }
    
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahMeja() {
        return jumlahMeja;
    }
    
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    
    public static int getJumlahRuangDosen() {
        return jumlahRuangDosen;
    }
    
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: Ruang Dosen");
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}