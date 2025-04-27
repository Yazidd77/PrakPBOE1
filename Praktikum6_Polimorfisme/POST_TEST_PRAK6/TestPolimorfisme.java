// nama file : TestPolimorfisme.java
// deskripsi : Main untuk TestPolimorfisme
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 24 april 2025
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args){
        System.out.println("NAMA : MUHAMMAD YAZID LUBIS"); 
        System.out.println("NIM : 24060123140170");       
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager Pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(Pegawai3);
        
        for (Pegawai emp : emps){
            emp.tampilData();
        }

    }
    
}
