/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// nama file    : BangunDatarGenericTest.java
// deskripsi    : main program BangunDatar
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran       : " + bdg.hitungKeliling());
        System.out.println("Luas Lingkaran           : " + bdg.hitungLuas());
        System.out.println("Tipe Generic             : " + bdg.get().getClass().getName());
        System.out.println("");
        
        Persegi p = new Persegi(10);
        BangunDatarGeneric<Persegi> bdg1 = new BangunDatarGeneric<Persegi>();
        bdg1.set(p);
        System.out.println("Keliling Persegi         : " + bdg1.hitungKeliling());
        System.out.println("Luas Persegi             : " + bdg1.hitungLuas());
        System.out.println("Tipe Generic             : " + bdg1.get().getClass().getName());
        System.out.println("");        
        
        PersegiPanjang p2 = new PersegiPanjang(5, 15);
        BangunDatarGeneric<PersegiPanjang> bdg2 = new BangunDatarGeneric<PersegiPanjang>();
        bdg2.set(p2);
        System.out.println("Keliling Persegi Panjang : " + bdg2.hitungKeliling());
        System.out.println("Luas Persegi Panjang     : " + bdg2.hitungLuas());
        System.out.println("Tipe Generic             : " + bdg2.get().getClass().getName());    
        System.out.println("");
        
        Segitiga s = new Segitiga(2, 2, 2);
        BangunDatarGeneric<Segitiga> bdg3 = new BangunDatarGeneric<Segitiga>();
        bdg3.set(s);
        System.out.println("Keliling Segitiga        : " + bdg3.hitungKeliling());
        System.out.println("Luas Segitiga            : " + bdg3.hitungLuas());
        System.out.println("Tipe Generic             : " + bdg3.get().getClass().getName());
    }
}