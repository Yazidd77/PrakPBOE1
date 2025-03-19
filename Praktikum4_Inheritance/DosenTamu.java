// nama file : DosenTamu.java
// deskripsi : buat kode Program Dosen Tamu
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025

import java.time.LocalDate;

public class DosenTamu extends Dosen{
    final private String NIDK;
    private LocalDate AkhirKontrak;
    private static double PersenTunjangan = 0.025;

    // kosntruktor
    public DosenTamu(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas, String NIDK, LocalDate AkhirKontrak){
        super(NIP,Nama,TanggalLahir,TMT,GajiPokok,Fakultas);
        this.NIDK= NIDK;
        this.AkhirKontrak = AkhirKontrak;
    }

    // selektor
    public String getNIDK(){
        return NIDK;
    }
    public LocalDate getAkhirKontrak(){
        return AkhirKontrak;
    }
    public static double getPersenTunjangan(){
        return PersenTunjangan;
    } 

    // mutator
    public void setAkhirKontrak(LocalDate AkhirKontrak){
        this.AkhirKontrak = AkhirKontrak;
    }
    public static void setPersenTunjangan(double PersenTunjangan){
        if(PersenTunjangan < getPersenTunjangan()){
            System.out.println("Persentase tunjangan tidak boleh turun");
        }else{
            DosenTamu.PersenTunjangan = PersenTunjangan;
        }
    }

    // others 
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok();
    }

    public void printInfo(){
        System.out.println("NIP           : " + getNIP());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + FormatTanggalIndonesia(getTanggalLahir()));
        System.out.println("TMT           : " + FormatTanggalIndonesia(getTMT()));
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa Kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("Akhir Kontrak : " + FormatTanggalIndonesia(getAkhirKontrak()));
        System.out.println("Gaji Pokok    : " + FormatRupiah(getGajiPokok()));
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x " + FormatRupiah(getGajiPokok()) + " = " + FormatRupiah(getTunjangan()) + "\n");
    }
}