/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// nama file    : Lingkaran.java
// deskripsi    : program ini berisi atribut dan method class Lingkaran sebagai BangunDatar
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public class Lingkaran extends BangunDatar{
    private final double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
    
    @Override
    public double hitungLuas(){
        return 3.14*jejari*jejari;
    }
}