// nama file : DosenTetap.java
// deskripsi : buat kode program Dosen tetap
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    final private String NIDN;
    final private static int BUP = 65;
    private static double PersenTunjangan = 0.02; // jangan final le, biar bisa naik hehe

    // kosntruktor
    public DosenTetap(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas, String NIDN){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    // selektor
    public String getNIDN(){
        return NIDN;
    }
    public static int getBUP(){
        return BUP;
    }
    public static double getPersenTunjangan(){
        return PersenTunjangan;
    } 

    // mutator
    public static void setPersenTunjangan(double PersenTunjangan){
        if(PersenTunjangan < getPersenTunjangan()){
            System.out.println("Persentase tunjangan tidak boleh turun");
        }else{
            DosenTetap.PersenTunjangan = PersenTunjangan;
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
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa Kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("BUP           : " + getTanggalPensiun());
        System.out.println("Gaji Pokok    : " + FormatRupiah(getGajiPokok()));
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x " + FormatRupiah(getGajiPokok()) + " = " + FormatRupiah(getTunjangan()) + "\n");
    }
}