/* Nama file  : Departemen.java
 * Deskripsi  : berisi implementasi class untuk Departemen
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public class Departemen {
    /* -------------------Atribut------------------- */
    private String nama;
    private String ketuaDepartemen;
    private double tarifBiayaKebersihan;
    private int jumlahRuangan;
    
     /* -------------------Method------------------- */
    public Departemen(String nama, String ketuaDepartemen, double tarifBiayaKebersihan) {
        this.nama = nama;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
        this.jumlahRuangan = 0;
    }
    
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKetuaDepartemen() {
        return ketuaDepartemen;
    }
    
    public void setKetuaDepartemen(String ketuaDepartemen) {
        this.ketuaDepartemen = ketuaDepartemen;
    }
    
    public double getTarifBiayaKebersihan() {
        return tarifBiayaKebersihan;
    }
    
    public void setTarifBiayaKebersihan(double tarifBiayaKebersihan) {
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }
    
    public int getJumlahRuangan() {
        return jumlahRuangan;
    }
    
    
    public void tambahRuangan() {
        jumlahRuangan++;
    }
    
    
    public void tampilkanInfo() {
        System.out.println("Departemen: " + nama);
        System.out.println("Ketua: " + ketuaDepartemen);
        System.out.println("Tarif Kebersihan: Rp " + tarifBiayaKebersihan + " per m²");
        System.out.println("Jumlah Ruangan: " + jumlahRuangan);
    }
}