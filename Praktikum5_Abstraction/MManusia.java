package Praktikum.Pertemuan5;

/* File        : MManusia.java
 * Penjelasan  : Program utama untuk menjalankan contoh penggunaan hierarki kelas Manusia
 * Pembuat  : MUHAMMAD YAZID LUBIS / 24060123140170
 * Dibuat pada : 20 Maret 2025
 */

public class MManusia {
    public static void main(String[] args) {
        // Membuat objek PNS dengan alamat
        PNS p1 = new PNS("Arataki Itto", "01-04-2006", "Jl. inazuma ", 15000000, "198302032006041002");

        // Membuat objek Pengusaha dengan alamat
        Pengusaha pe1 = new Pengusaha("Mydeimos", "01-01-2000", "Jl.kremnos", 55000000, "000-556-773-212-000-5");

        // Membuat objek Petani dengan alamat
        Petani pt1 = new Petani("Sangonomiya Kokomi", "09-01-1977", "Jl. watatsumi no 7", 5000000, "watatsumi");

        // Membuat objek PNS tanpa alamat, kemudian set alamat secara terpisah
        PNS p2 = new PNS("Kamisato Ayaka", "01-04-2010", 10000000, "198004212010041002");
        p2.setAlamat("Jl. hanamizaka");

        // Menampilkan jumlah setiap jenis objek
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        // Menampilkan informasi pajak
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        // Menampilkan informasi masa kerja
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        // Menampilkan informasi lengkap setiap objek
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
