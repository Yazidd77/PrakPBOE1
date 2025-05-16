/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// nama file    : Burung.java
// deskripsi    : program ini berisi atribut dan method class Burung
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public class Burung extends Anabul{
    public Burung(String nama){
        super(nama);
    }

    @Override
    public void tampilData(){
        System.out.println("Tipe Anabul: Burung");
    }

    @Override
    public void bergerak(){
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara cuit.");
    }
}