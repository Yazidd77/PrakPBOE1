/* Nama file  : RuangDepartemenKantor.java
 * Deskripsi  : berisi implementasi class untuk Ruang Departemen Kantor
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public class RuangDepartemenKantor extends RuangDepartemen {
    /* -------------------Atribut------------------- */
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private static int jumlahRuangDepartemenKantor = 0;
    
     /* -------------------Method------------------- */
    public RuangDepartemenKantor(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                                Departemen departemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas, departemen);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        jumlahRuangDepartemenKantor++;
    }
    
    
    public int getJumlahMeja() {
        return jumlahMeja;
    }
    
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahLemari() {
        return jumlahLemari;
    }
    
    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }
    
    
    public static int getJumlahRuangDepartemenKantor() {
        return jumlahRuangDepartemenKantor;
    }
    
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: Ruang Departemen");
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}
