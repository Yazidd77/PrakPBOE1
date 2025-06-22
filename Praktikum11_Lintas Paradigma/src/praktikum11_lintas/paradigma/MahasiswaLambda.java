/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_lintas.paradigma;

/**
 *
 * @author User
 */
import java.util.HashMap;
import java.util.Map;

public class MahasiswaLambda {
    public static void main(String[] args) {
        Map<String, String> dataMahasiswa = new HashMap<>();
        Map<String, String> dataMahasiswa2 = new HashMap<>();
        
        // menambahkan data mahasiswa
        dataMahasiswa.put("M010001", "Atsuko Maeda");
        dataMahasiswa.put("M010002", "Yuko Oshima");
        dataMahasiswa.put("M010003", "Mariko Shinoda");
        dataMahasiswa.put("M010004", "Mayu Watanabe");
        dataMahasiswa.put("M010005", "Takahashi Minami");
        
        // menambahkan data mahasiswa2
        dataMahasiswa2.put("M020001", "Kojima Haruna");
        dataMahasiswa2.put("M020002", "Tomomi Itano");
        dataMahasiswa2.put("M020003", "Yuki Kashiwagi");
        dataMahasiswa2.put("M020004", "Sashihara rino");
        dataMahasiswa2.put("M020005", "Matsui Jurina");
        
        // dengan lambda 
        dataMahasiswa.forEach((nim, nama) -> System.out.println(nim + "\t| " + nama));
        
        System.out.println("");
        
        // dengan lambda dengan blok statement
        dataMahasiswa2.forEach((nim, nama) -> {
            System.out.println(nim + "\t| " + nama);
        });
    }
}
