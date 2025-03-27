package Praktikum.Pertemuan5;

/* File        : PNS.java
 * Penjelasan  : Kelas turunan dari Manusia yang merepresentasikan Pegawai Negeri Sipil
 * Pembuat  : MUHAMMAD YAZID LUBIS / 24060123140170
 * Dibuat pada : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia {
    /* ========== Deklarasi Atribut ========== */
    private String nip;  // Nomor Induk Pegawai
    private static int counterPNS = 0;  // Penghitung objek PNS

    /* ========== Implementasi Method ========== */
    // Konstruktor default
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    // Konstruktor dengan semua parameter
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor dengan alamat default
    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    // Mendapatkan jumlah total objek PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Implementasi method hitungPajak dari interface Pajak
    @Override
    public double hitungPajak() {
        // PNS dikenakan pajak 10% dari pendapatan
        return 0.10 * pendapatan;
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

            // Konstanta tambahan untuk PNS
            int A = 8;

            // Hasil akhir = masa kerja aktual + konstanta
            return masaKerja + A;
        } catch (Exception e) {
            // Tangani error format tanggal
            System.out.println("Error format tanggal: " + e.getMessage());
            return 0;
        }
    }

    // Implementasi method cetakInfo untuk menampilkan informasi PNS
    @Override
    public void cetakInfo() {
        System.out.println("=================================== INFORMASI PNS =========================================");
        // Panggil method cetakInfo dari parent class (Manusia)
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Pajak: Rp " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("===========================================================================================");
    }
}
