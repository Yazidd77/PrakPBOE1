// nama file    : Persegi.java
// deskripsi    : program ini berisi class Lingkaran yang merupakan subclass dari superclass BangunDatar
// pembuat      : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal      : 20 Maret 2025

public class Main{
    public static void main(String[] args){
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10, "Ungu", "Pink");
        Persegi P2 = new Persegi(5, "Hijau", "Biru");
        BangunDatar L1 = new Lingkaran(7, "Biru", "Putih");
        Lingkaran L2 = new Lingkaran (14, "Magenta", "Merah");

        System.out.println("~~~~~~~~~~ info Persegi P1 ~~~~~~~~~~");
        P1.printInfo();
        System.out.println("\n~~~~~~~~~~ info Persegi P2 ~~~~~~~~~~");
        P2.printInfo();
        System.out.println("\n~~~~~~~~~ info Lingkaran L1 ~~~~~~~~~");
        L1.printInfo();
        System.out.println("\n~~~~~~~~~ info Lingkaran L2 ~~~~~~~~~");
        L2.printInfo();

        // apakah sama?
        System.out.println("\n\n~~~~~~~~~~~~ isEqualLuas ~~~~~~~~~~~~");
        System.out.println("apakah luas P1 sama dengan luas P2?");
        if(P1.isEqualLuas(P2)){
            System.out.println("---> wow, luas P1 sama dengan luas P2!");
        } else{
            System.out.println("---> oh no, luas P1 tidak sama dengan luas P2:(");
        }

        System.out.println("\n\n~~~~~~~~~~ isEqualKeliling ~~~~~~~~~~");
        System.out.println("apakah keliling L1 sama dengan keliling L2?");
        if(L1.isEqualKeliling(L2)){
            System.out.println("---> wow, keliling L1 sama dengan keliling L2!");
        } else{
            System.out.println("---> oh no, keliling L1 tidak sama dengan keliling L2:(");
        }

        System.out.println("\n\n~~~~~~~~~~~~~~~ resize ~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~ zoom in ~~~~~~~~~~~~~~");
        System.out.println("sebelum zoomIn Lingkaran L2: " + L2.getJari());
        L2.zoomIn();
        System.out.println("setelah zoomIn Lingkaran L2: " + L2.getJari());
        
        System.out.println("\n~~~~~~~~~~~~~~ zoom out ~~~~~~~~~~~~~");
        System.out.println("sebelum zoomOut Persegi P2: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("setelah zoomOut Persegi P2: " + P2.getSisi());
    }
}