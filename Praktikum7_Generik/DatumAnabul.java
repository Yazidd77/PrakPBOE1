// nama file : DatumAnabul.java
// deskripsi : datum anabul
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 15 mei 2025

class DatumAnabul {
    public static void main(String[] args){
        Kucing kucing = new Kucing("Han Seo-In");
        Anjing anjing = new Anjing("Baek Yeongwoon");
        Burung Burung = new Burung("Xian Yun");

        Datum<Kucing> datumKucing = new Datum<>(kucing);
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        Datum<Burung> datumBurung = new Datum<>(Burung);

        System.out.println("==== Datum Anabul ====");

        System.out.println("\n--- kucing ---");
        Kucing k = datumKucing.getIsi();
        System.out.println("Nama: " + k.getNama());
        k.bersuara();
        k.gerak();

        System.out.println("==== Anjing ====");
        Anjing a = datumAnjing.getIsi();
        System.out.println("Nama: " + a.getNama());
        a.bersuara();
        a.gerak();

        System.out.println("=== Burung ===");
        Burung b = datumBurung.getIsi();
        System.out.println("Nama: " + b.getNama());
        b.bersuara();
        b.gerak();

        System.out.println("\n=== Perubahan Isi Datum ===");
        Kucing KucingBaru = new Kucing("Hiiragi");
        System.out.println("Sebelum perubahan: " + datumKucing.getIsi().getNama());
        datumKucing.setIsi(KucingBaru);
        System.out.println("Setelah perubhan: " + datumKucing.getIsi().getNama());
        datumKucing.getIsi().bersuara();

    }
    
}
