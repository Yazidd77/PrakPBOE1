// nama file : MainAnabul.java
// deskripsi : kode main dari anabul
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 27 april 2025
public class MainAnabul {
    public static void main(String[] args) {
        Anabul Kucing = new Kucing("Han Seo-In");
        Anabul Anjing = new Anjing("Baek Yeongwoon");
        Anabul burung = new Burung("Xian Yun");

        Anabul[] daftarAnabul = {Kucing, Anjing, burung};

        System.out.println("==== haloooo ====\n" );

        for (Anabul anabul : daftarAnabul){

            System.out.println("Nama : " + anabul.getNama());
            System.out.println("Jenis : " + anabul.getClass().getSimpleName());
            System.out.println("Bergerak dengan " + anabul.gerak());
            System.out.println("Bersuara : " + anabul.bersuara());
            System.out.println("-----------");
        }
    }
    
}
