// nama file : MainContohMetodeGenerik.java
// deskripsi : kode program MainContohMetodeGenerik
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 15 mei 2025

class MainContohMetodeGenerik {
    public static void main(String[] args){
       
        Kucing kucing1 = new Kucing("seungho");
        Kucing kucing2 = new Kucing("jaejin");
        Anjing anjing = new Anjing("dohoon");
        Burung burung = new Burung(" woo ik soo");

        Datum<Kucing> datumKucing1 = new Datum<>(kucing1);
        Datum<Kucing>datumKucing2 = new Datum<>(kucing2);
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        Datum<Burung> datumBurung = new Datum<>(burung);
        Datum<String>datumString = new Datum<>("ini adalah String");

        ContohMetodeGenerik cmg = new ContohMetodeGenerik();

        System.out.println("===== Penerapan Metode Generik =====");

        System.out.println("\n--- Informasi Datum ---");
        cmg.displayDatumInfo(datumKucing1);
        cmg.displayDatumInfo(datumAnjing);
        cmg.displayDatumInfo(datumBurung);
        cmg.displayDatumInfo(datumString);

        System.out.println("\n--- Anabul ---");
        System.out.println("Kucing");
        cmg.demonstrateAnabul(datumKucing1);
        System.out.println("\nAnjing:");
        cmg.demonstrateAnabul(datumAnjing);
        System.out.println("\nBurung:");
        cmg.demonstrateAnabul(datumBurung);

        System.out.println("\n--- Perbandingan Datum ---");
        System.out.println("Membandingkan dua Datum Kucing:");
        cmg.compareDatum(datumKucing1, datumKucing2);
        System.out.println("\nMembandingkan Datum Kucing dengan Datum Anjing:");
        cmg.compareDatum(datumKucing1, datumAnjing);
        System.out.println("\nMembandingkan Datum kucing dengan Datum String:");
        cmg.compareDatum(datumKucing1, datumString);

        System.out.println("\n--- Mengubah Nilai dalam Datum ---");
        System.out.println("Sebelum perubahan: " + datumKucing1.getIsi().getNama());
        cmg.setNewValue(datumKucing1, kucing2);
        System.out.println("Setelah perubahan: " + datumKucing1.getIsi().getNama());
        
        System.out.println("\n--- Mengubah Nilai dalam Datum ---");
        System.out.println("Sebelum perubahan: " + datumKucing1.getIsi().getNama());
        cmg.setNewValue(datumKucing1, kucing2);
        System.out.println("Setelah perubahan: " + datumKucing1.getIsi().getNama());
        System.out.println("\n==================================================\n");


    }
    
}
