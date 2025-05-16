/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// nama file    : Kucing.java
// deskripsi    : program berisi atribut dan method kucing
// pembuat      : MUHAMMAD YAZID LUBIS
// nim          : 24060123140170
// tanggal      : 15 Mei 2025
public class Kucing extends Anabul{
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void tampilData(){
        System.out.println("Tipe Anabul: Kucing");
    }

    @Override
    public void bergerak(){
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara meong.");
    }
}
