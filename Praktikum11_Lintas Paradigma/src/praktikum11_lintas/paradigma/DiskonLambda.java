/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum11_lintas.paradigma;

/**
 *
 * @author User
 */
interface IDiskkon {
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDiskkon diskonMerdeka = new IDiskkon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        
        // dengan lambda
        IDiskkon diskonLebaran = (harga) -> harga - (harga * 0.4);
        
        // dengan lambda dengan blok statement
        IDiskkon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa  : " + diskonBiasa.hitungDiskon(45000));
    }
}