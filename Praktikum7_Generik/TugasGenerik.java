// nama file : TugasGenerik.java
// deskripsi : kode program TugasGenerik
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 15 mei 2025



public class TugasGenerik {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PRAKTIKUM PBO - IMPLEMENTASI KELAS GENERIK");
        System.out.println("==================================================");
        
        // BAGIAN 1: Demonstrasi kelas Anabul dan turunannya
        System.out.println("\n----- 1. DEMONSTRASI KELAS ANABUL -----");
        
        // Create instances of each animal
        Kucing kucing = new Kucing("Kitty");
        Anjing anjing = new Anjing("Rex");
        Burung burung = new Burung("Tweety");
        
        // Demonstrate sounds
        System.out.println("\nDemonstrasi Suara:");
        kucing.bersuara();
        anjing.bersuara();
        burung.bersuara();
        
        // Demonstrate movements
        System.out.println("\nDemonstrasi Gerakan:");
        kucing.gerak();
        anjing.gerak();
        burung.gerak();
        
        // BAGIAN 2: Demonstrasi kelas generik Datum dengan objek Anabul
        System.out.println("\n----- 2. DEMONSTRASI KELAS GENERIK DATUM -----");
        
        // Create Datum objects for each animal
        Datum<Kucing> datumKucing = new Datum<>(kucing);
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        Datum<Burung> datumBurung = new Datum<>(burung);
        
        // Demonstrate accessing and using the content of Datum objects
        System.out.println("\nMengakses objek dari Datum<Kucing>:");
        System.out.println("Nama kucing: " + datumKucing.getIsi().getNama());
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().gerak();
        
        System.out.println("\nMengakses objek dari Datum<Anjing>:");
        System.out.println("Nama anjing: " + datumAnjing.getIsi().getNama());
        datumAnjing.getIsi().bersuara();
        datumAnjing.getIsi().gerak();
        
        System.out.println("\nMengakses objek dari Datum<Burung>:");
        System.out.println("Nama burung: " + datumBurung.getIsi().getNama());
        datumBurung.getIsi().bersuara();
        datumBurung.getIsi().gerak();
        
        // Demonstrate changing the content of a Datum
        System.out.println("\nMengubah isi Datum<Kucing>:");
        Kucing kucingBaru = new Kucing("Whiskers");
        System.out.println("Sebelum perubahan: " + datumKucing.getIsi().getNama());
        datumKucing.setIsi(kucingBaru);
        System.out.println("Setelah perubahan: " + datumKucing.getIsi().getNama());
        
        // BAGIAN 3: Demonstrasi kelas ContohMetodeGenerik
        System.out.println("\n----- 3. DEMONSTRASI KELAS CONTOHMETODEGENERIK -----");
        
        // Create an instance of ContohMetodeGenerik
        ContohMetodeGenerik cmg = new ContohMetodeGenerik();
        
        // Demonstrate displayDatumInfo method
        System.out.println("\nDemonstrasi metode displayDatumInfo:");
        cmg.displayDatumInfo(datumKucing);
        cmg.displayDatumInfo(datumAnjing);
        cmg.displayDatumInfo(datumBurung);
        
        // Create Datum with non-Anabul content
        Datum<String> datumString = new Datum<>("Ini adalah string");
        Datum<Integer> datumInteger = new Datum<>(42);
        
        cmg.displayDatumInfo(datumString);
        cmg.displayDatumInfo(datumInteger);
        
        // Demonstrate demonstrateAnabul method
        System.out.println("\nDemonstrasi metode demonstrateAnabul untuk Datum<Kucing>:");
        cmg.demonstrateAnabul(datumKucing);
        
        System.out.println("\nDemonstrasi metode demonstrateAnabul untuk Datum<Anjing>:");
        cmg.demonstrateAnabul(datumAnjing);
        
        System.out.println("\nDemonstrasi metode demonstrateAnabul untuk Datum<Burung>:");
        cmg.demonstrateAnabul(datumBurung);
        
        // Demonstrate compareDatum method
        System.out.println("\nDemonstrasi metode compareDatum:");
        
        Datum<Kucing> datumKucing2 = new Datum<>(new Kucing("Fluffy"));
        
        System.out.println("\nMembandingkan dua Datum<Kucing>:");
        cmg.compareDatum(datumKucing, datumKucing2);
        
        System.out.println("\nMembandingkan Datum<Kucing> dengan Datum<Anjing>:");
        cmg.compareDatum(datumKucing, datumAnjing);
        
        System.out.println("\nMembandingkan Datum<Kucing> dengan Datum<String>:");
        cmg.compareDatum(datumKucing, datumString);
        
        // Demonstrate setNewValue method
        System.out.println("\nDemonstrasi metode setNewValue:");
        Kucing kucingLain = new Kucing("Tom");
        System.out.println("Sebelum perubahan: " + datumKucing.getIsi().getNama());
        cmg.setNewValue(datumKucing, kucingLain);
        System.out.println("Setelah perubahan: " + datumKucing.getIsi().getNama());
        
        System.out.println("\n==================================================");
        System.out.println("                PROGRAM SELESAI");
        System.out.println("==================================================");
    }
}