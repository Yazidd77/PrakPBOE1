package Praktikum.Pertemuan5;

/* File        : Pengusaha.java
 * Penjelasan  : Kelas turunan dari Manusia yang merepresentasikan Pengusaha
 * Programmer  : MUHAMMAD YAZID LUBIS / 24060123140170
 * Dibuat pada : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia {
    /* ========== Deklarasi Atribut ========== */
    private String npwp;  // Nomor Pokok Wajib Pajak
    private static int counterPengusaha = 0;  // Penghitung objek Pengusaha

    /* ========== Implementasi Method ========== */
    // Konstruktor default
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    // Konstruktor dengan semua parameter
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Konstruktor dengan alamat default
    public Pengusaha(String nama, String tgl_mulai_kerja, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter dan Setter
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Mendapatkan jumlah total objek Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Implementasi method hitungPajak dari interface Pajak
    @Override
    public double hitungPajak() {
        // Pengusaha dikenakan pajak 15% dari pendapatan
        return 0.15 * pendapatan;
    }

    // Implementasi method abstrak hitungMasaKerja
    @Override
    public int hitungMasaKerja() {
        try {
            // Format tanggal dd-MM-yyyy
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            // Parsing tanggal mulai kerja
            LocalDate tanggalMulai = LocalDate.parse(tgl_mulai_kerja, formatter);
            // Tanggal saat ini
            LocalDate now = LocalDate.now();

            // Hitung selisih tahun
            int masaKerja = (int) ChronoUnit.YEARS.between(tanggalMulai, now);

            // Konstanta tambahan untuk Pengusaha
            int B = 7;

            // Hasil akhir = masa kerja aktual + konstanta
            return masaKerja + B;
        } catch (Exception e) {
            // Tangani error format tanggal
            System.out.println("Error format tanggal: " + e.getMessage());
            return 0;
        }
    }

    // Implementasi method cetakInfo untuk menampilkan informasi Pengusaha
    @Override
    public void cetakInfo() {
        System.out.println("=================================== INFORMASI PENGUSAHA ===================================");
        // Panggil method cetakInfo dari parent class (Manusia)
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Pajak: Rp " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("==========================================================================================");
    }
}