/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

// nama file    : BangunDatarGeneric.java
// deskripsi    : program ini berisi konstruksi Bangun Datar Generic
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }   
    
    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}