// nama file : Tendik.java
// deskripsi : buat kode program Tendik
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025

import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.util.Locale;


public class Tendik extends Pegawai{
    final private static int BUP = 55;
    private static double PersenTunjangan = 0.01; // jangan final le, biar bisa naik hehe
    private String BidangKerja;

    // konstruktor
    public Tendik(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String BidangKerja){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.BidangKerja = BidangKerja;
    }

    // selektor
    public String getBidangKerja(){
        return BidangKerja;
    }   
    public static double getPersenTunjangan(){
        return PersenTunjangan;
    } 
    public static int getBUP(){
        return BUP;
    }

    // mutator 
    public void setBidangKerja(String BidangKerja){
        this.BidangKerja = BidangKerja;
    }
    public static void setPersenTunjangan(double PersenTunjangan){
        if(PersenTunjangan < getPersenTunjangan()){
            System.out.println("Persentase tunjangan tidak boleh turun");
        }else{
            Tendik.PersenTunjangan = PersenTunjangan;
        }
    }

    // others method 
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok() * getLamaKerja().getYears();
    }

    public LocalDate getTanggalPensiun(){
        return getTanggalLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("NIP           : " + getNIP());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + FormatTanggalIndonesia(getTanggalLahir()));
        System.out.println("TMT           : " + FormatTanggalIndonesia(getTMT()));
        System.out.println("Bidang Kerja  : " + getBidangKerja());
        System.out.println("Masa Kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("Gaji Pokok    : " + FormatRupiah(getGajiPokok()));
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x " + FormatRupiah(getGajiPokok()) + " = " + FormatRupiah(getTunjangan()) + "\n");
    }
}