/* Nama file  : RuangDepartemen.java
 * Deskripsi  : berisi implementasi class untuk Ruang Departemen
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public abstract class RuangDepartemen extends Ruang {
    /* -------------------Atribut------------------- */
    private Departemen departemen;
    private static int jumlahRuangDepartemen = 0;
    
     /* -------------------Method------------------- */
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, Departemen departemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        departemen.tambahRuangan();
        jumlahRuangDepartemen++;
    }
    
    
    public Departemen getDepartemen() {
        return departemen;
    }
    
    
    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
    
    
    public static int getJumlahRuangDepartemen() {
        return jumlahRuangDepartemen;
    }
    
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Departemen: " + departemen.getNama());
    }
    

    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * departemen.getTarifBiayaKebersihan();
    }
}

