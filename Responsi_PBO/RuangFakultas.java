/* Nama file  : RuangFakultas.java
 * Deskripsi  : berisi implementasi class untuk Ruang Fakultas
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */
public abstract class RuangFakultas extends Ruang {
    /* -------------------Atribut------------------- */
    private static double tarifBiayaKebersihan;
    private static int jumlahRuangFakultas = 0;
    
     /* -------------------Method------------------- */
    public RuangFakultas(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        jumlahRuangFakultas++;
    }
    
    
    public static double getTarifBiayaKebersihan() {
        return tarifBiayaKebersihan;
    }
    
    public static void setTarifBiayaKebersihan(double tarif) {
        tarifBiayaKebersihan = tarif;
    }
    
  
    public static int getJumlahRuangFakultas() {
        return jumlahRuangFakultas;
    }
    
  
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * tarifBiayaKebersihan;
    }
}
