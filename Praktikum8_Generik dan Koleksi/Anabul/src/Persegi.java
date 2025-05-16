/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// nama file    : Persegi.java
// deskripsi    : program ini berisi atribut dan method class Persegi sebagai BangunDatar
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public class Persegi extends BangunDatar {
    private final double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return sisi*4;
    }
    
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}