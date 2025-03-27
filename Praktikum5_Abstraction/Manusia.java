
package Praktikum.Pertemuan5;

/* File        : Manusia.java
 * Penjelasan  : Class abstrak Manusia dengan atribut dan method untuk operasi dasar entitas Manusia
 * Pembuat  : MUHAMMAD YAZID LUBIS / 24060123140170
 * Dibuat pada : 20 Maret 2025
 */

public abstract class Manusia implements Pajak {
    /* ========== Deklarasi Atribut ========== */
    protected String nama;
    protected String alamat;
    protected String tgl_mulai_kerja;
    protected double pendapatan;
    protected static int counterMns = 0;

    /* ========== Implementasi Method ========== */
    // Konstruktor default
    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = "00-00-0000";
        this.alamat = "";
        this.pendapatan = 0;
        counterMns++;
    }

    // Konstruktor dengan semua parameter
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Konstruktor dengan alamat default
    public Manusia(String nama, String tgl_mulai_kerja, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        this.alamat = "";
        counterMns++;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Mendapatkan jumlah total objek Manusia
    public static int getCounterMns() {
        return counterMns;
    }

    // Menampilkan informasi dasar tentang Manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    // Method abstrak untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}
