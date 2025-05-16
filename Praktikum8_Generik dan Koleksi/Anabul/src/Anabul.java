/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

// nama file    : Anabul.java
// deskripsi    : program ini berisi atribut dan method class Anabul
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public abstract class Anabul{
    private String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void bersuara();
    
    public abstract void bergerak();

    public abstract void tampilData();
}
