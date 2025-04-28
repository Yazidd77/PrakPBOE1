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


// apa manfaat polimorfisme pada kasus ini ?
/*

jawab : 
kita dapat menyimpan objek dari kelas turunan 
yang berbeda (seperti programmer dan manajer) dalam satu wadah array List 
yang bertipe pegawai. terus juga penggunaan interface yang ssergam.
jadi semua objek pegawai dapat diperlakukan dengan cara yang sama
melalui interface pegawai, tetapi akan berperilaku
sesuai dengan implementasi spesifiknya.

*/

//apa permasalahan yang muncul jika implementasi ini tidak diterapkan dengan polimorfisme??
/*

jawab :
-tipe data yang eksplisit
-pemrosesan data yang rumit
-kode yang lebih panjang
-sulit untuk diperluas
-duplikasi kode

*/



