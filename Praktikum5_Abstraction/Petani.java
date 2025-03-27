package Praktikum.Pertemuan5;

/* File        : Petani.java
 * Penjelasan  : Kelas turunan dari Manusia yang merepresentasikan Petani
 * Programmer  : MUHAMMAD YAZID LUBIS / 24060123140170
 * Dibuat pada : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia {
    /* ========== Deklarasi Atribut ========== */
    private String asal_kota;  // Kota asal petani
    private static int counterPetani = 0;  // Penghitung objek Petani

    /* ========== Implementasi Method ========== */
    // Konstruktor default
    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    // Konstruktor dengan semua parameter
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Konstruktor dengan alamat default
    public Petani(String nama, String tgl_mulai_kerja, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter dan Setter
    public String getAsal_kota() {
        return asal_kota;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // Mendapatkan jumlah total objek Petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Implementasi method hitungPajak dari interface Pajak
    @Override
    public double hitungPajak() {
        // Petani tidak dikenakan pajak
        return 0;
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

            // Konstanta tambahan untuk Petani
            int C = 0;

            // Hasil akhir = masa kerja aktual + konstanta (tidak ada tambahan untuk petani)
            return masaKerja + C;
        } catch (Exception e) {
            // Tangani error format tanggal
            System.out.println("Error format tanggal: " + e.getMessage());
            return 0;
        }
    }

    // Implementasi method cetakInfo untuk menampilkan informasi Petani
    @Override
    public void cetakInfo() {
        System.out.println("=================================== INFORMASI PETANI =====================================");
        // Panggil method cetakInfo dari parent class (Manusia)
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Pajak: Rp " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("==========================================================================================");
    }
}