/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// nama file    : Segitiga.java
// deskripsi    : program ini berisi atribut dan method class Segitiga sebagai BangunDatar
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025

public class Segitiga extends BangunDatar {
    private final double sisiA;
    private final double sisiB;
    private final double sisiC;
    
    public Segitiga(double sisiA, double sisiB, double sisiC){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
    
    @Override
    public double hitungKeliling(){
        return sisiA + sisiB + sisiC;
    }
    
    @Override
    public double hitungLuas(){
        double s = (sisiA + sisiB + sisiC)/2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }
}