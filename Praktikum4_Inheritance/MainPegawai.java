// nama file : MainPegawai.java
// deskripsi : buat main kode pegawai
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 13 maret 2025

import java.time.LocalDate;

public class MainPegawai{
    public static void main(String[] args) {
        Tendik T1, T2, T3;
        DosenTetap DTe1, DTe2, DTe3;
        DosenTamu DTa1, DTa2, DTa3;

        T1 = new Tendik("111111", "Budi Santoso", 
                                    LocalDate.of(1985, 6, 15), 
                                    LocalDate.of(2010, 9, 1), 
                                    5000000, "Kemahasiswaan");
        T2 = new Tendik("222222", "Dewi Lestari", 
                                    LocalDate.of(1990, 3, 22), 
                                    LocalDate.of(2015, 7, 1), 
                                    4500000, "Akademik");
        T3 = new Tendik("333333", "Slamet Riyadi", 
                                    LocalDate.of(1982, 11, 5), 
                                    LocalDate.of(2008, 1, 15), 
                                    5200000, "Sumber Daya");

        DTe1 = new DosenTetap("444444", "Andi Wijaya", 
                                                LocalDate.of(1980, 4, 10), 
                                                LocalDate.of(2005, 8, 1), 
                                                7000000, "Fakultas Teknik", 
                                                "12345678");
        DTe2 = new DosenTetap("555555", "Lina Kusuma", 
                                                LocalDate.of(1985, 9, 14), 
                                                LocalDate.of(2010, 6, 20), 
                                                6800000, "Fakultas Ekonomi", 
                                                "23456789");
        DTe3 = new DosenTetap("666666", "Surya Darma", 
                                                LocalDate.of(1978, 7, 30), 
                                                LocalDate.of(2003, 2, 5), 
                                                7500000, "Fakultas Sains dan Matematika", 
                                                "34567890");

        DTa1 = new DosenTamu("777777", "Siti Rahma", 
                                             LocalDate.of(1975, 12, 20), 
                                             LocalDate.of(2015, 7, 1), 
                                             4000000, "Fakultas Ekonomi", 
                                             "87654321",
                                             LocalDate.of(2025, 5, 10));
        DTa2 = new DosenTamu("888888", "Ahmad Fauzi", 
                                             LocalDate.of(1983, 5, 25), 
                                             LocalDate.of(2018, 9, 10), 
                                             4200000, "Fakultas Hukum", 
                                             "76543210",
                                             LocalDate.of(2025, 5, 11));
        DTa3 = new DosenTamu("999999", "Rina Maulina", 
                                             LocalDate.of(1990, 1, 10), 
                                             LocalDate.of(2020, 3, 15), 
                                             3800000, "Fakultas Kedokteran", 
                                             "65432109",
                                             LocalDate.of(2025, 2, 9));

        T1.printInfo();
        T2.printInfo();
        T3.printInfo();

        DTe1.printInfo();
        DTe2.printInfo();
        DTe3.printInfo();
        
        DTa1.printInfo();
        DTa2.printInfo();
        DTa3.printInfo();
    }
}