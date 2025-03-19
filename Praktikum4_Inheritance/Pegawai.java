// nama file : Pegawai.java
// deskripsi : buat kode program Pegawai
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025


import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai{
    final private String NIP;
    private String Nama;
    private LocalDate TanggalLahir;
    private LocalDate TMT;
    private double GajiPokok;

    // konstruktor
    public Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double  GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    // selektor
    public String getNIP(){
        return NIP;
    }
    public String getNama(){
        return Nama;
    }
    public LocalDate getTanggalLahir(){
        return TanggalLahir;
    }
    public LocalDate getTMT(){
        return TMT;
    }
    public double  getGajiPokok(){
        return GajiPokok;
    }

    // mutator
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setTanggalLahir(LocalDate TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }
    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }
    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    // others
    public Period getLamaKerja(){
        return Period.between(TMT, LocalDate.of(2025,3,10)); // now = 10 Maret 2025
    }

    public String FormatTanggalIndonesia(LocalDate Tanggal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return Tanggal.format(formatter);
    }

    public String FormatRupiah(double Nilai){
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(Nilai);
    }
}