/* Nama file  : Main.java
 * Deskripsi  : berisi implementasi class untuk Main
 * Pembuat    : MUHAMMAD YAZID LUBIS // 24060123140170
 * Tanggal    : 27 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
        RuangFakultas.setTarifBiayaKebersihan(5000);
        
        
        Departemen deptInformatika = new Departemen("Informatika", "Dr. arataki itto", 6000);
        Departemen deptMatematika = new Departemen("Matematika", "Dr. Mydeimos", 5500);
        
        
        RuangKelas kelas1 = new RuangKelas("K001", 8, 6, 4, 40, 42, 2);
        RuangKelas kelas2 = new RuangKelas("K002", 10, 8, 4, 60, 62, 3);
        
        
        LabKomputer labKom1 = new LabKomputer("LK001", 10, 8, 4, 30, 
                                             "Laboratorium Pemrograman", 500000, 31);
        
        
        String[] mkBio = {"Biologi Dasar", "Mikrobiologi", "Genetika"};
        LabNonKomputer labBio = new LabNonKomputer("LB001", 12, 8, 4, 25,
                                                  "Laboratorium Biologi", 750000, mkBio);
        
        
        RuangDepartemenKantor kantorInformatika = new RuangDepartemenKantor("RI001", 6, 5, 3, 10,
                                                                           deptInformatika, 5, 12, 4);
        
        
        RuangDosen dosenA = new RuangDosen("RD001", 4, 3, 3, 3,
                                          deptInformatika, "Dr. Sangonomiya Kokomi", 4, 2);
        RuangDosen dosenB = new RuangDosen("RD002", 4, 3, 3,
                                          deptMatematika, "Dr. Fu Xuan");
        
        
        System.out.println("========== INFORMASI RUANGAN ==========");
        
        System.out.println("\n----- INFORMASI RUANG KELAS -----");
        kelas1.tampilkanInfo();
        
        System.out.println("\n----- INFORMASI LABORATORIUM KOMPUTER -----");
        labKom1.tampilkanInfo();
        
        System.out.println("\n----- INFORMASI LABORATORIUM NON-KOMPUTER -----");
        labBio.tampilkanInfo();
        
        System.out.println("\n----- INFORMASI RUANG DEPARTEMEN -----");
        kantorInformatika.tampilkanInfo();
        
        System.out.println("\n----- INFORMASI RUANG DOSEN -----");
        dosenA.tampilkanInfo();
        System.out.println("\n--- Ruang Dosen dengan Constructor Overloading ---");
        dosenB.tampilkanInfo();
        
        
        System.out.println("\n========== STATISTIK RUANGAN ==========");
        System.out.println("Total Ruang Fakultas: " + RuangFakultas.getJumlahRuangFakultas());
        System.out.println("- Ruang Kelas: " + RuangKelas.getJumlahRuangKelas());
        System.out.println("- Ruang Laboratorium: " + RuangLaboratorium.getJumlahRuangLab());
        System.out.println("  - Lab Komputer: " + LabKomputer.getJumlahLabKomputer());
        System.out.println("  - Lab Non-Komputer: " + LabNonKomputer.getJumlahLabNonKomputer());
        System.out.println("Total Ruang Departemen: " + RuangDepartemen.getJumlahRuangDepartemen());
        System.out.println("- Ruang Kantor Departemen: " + RuangDepartemenKantor.getJumlahRuangDepartemenKantor());
        System.out.println("- Ruang Dosen: " + RuangDosen.getJumlahRuangDosen());
        
        
        System.out.println("\n========== INFORMASI DEPARTEMEN ==========");
        deptInformatika.tampilkanInfo();
        System.out.println();
        deptMatematika.tampilkanInfo();
    }
}