/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// nama file    : PersegiPanjang.java
// deskripsi    : program ini berisi atribut dan method class Persegi Panjang sebagai BangunDatar
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public class PersegiPanjang extends BangunDatar {
    private final double panjang;
    private final double lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }
    
    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }
}