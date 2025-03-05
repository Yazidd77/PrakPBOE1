/* Nama file  : Kendaraan.java
 * Deskripsi  : berisi atribut dan method dalam class Kendaraan
 * Pembuat    : MUHAMMAD YAZID LUBIS / 24060123140170
 * Tanggal    : 27 Februari 2025
 */

 package Bagian2;

 public class Kendaraan {
     /********************Atribut********************/
     private String noPlat;
     private String jenis;
     private Mahasiswa pemilik; 
     /********************Method*********************/
     public Kendaraan(){
         this.noPlat = "-";
         this.jenis = "-";
         this.pemilik = null;
     }
 
     public Kendaraan(String noPlat, String jenis){
         this.noPlat = noPlat;
         this.jenis = jenis;
         this.pemilik = null;
     }
 
 
     /***************Getter & Setter*****************/
     public void setNoPlat(String noPlat){
         this.noPlat = noPlat;
     }
 
     public void setJenis(String jenis){
         this.jenis = jenis;
     }
 
     public String getNoPlat(){
         return this.noPlat;
     }
 
     public String getJenis(){
         return this.jenis;
     }
 
     public Mahasiswa getPemilik() {
         return pemilik;
     }

     public void setPemilik(Mahasiswa pemilikBaru) {
        if (this.pemilik != null) {
            this.pemilik.setKendaraan(null); // Hapus kepemilikan sebelumnya
        }
        this.pemilik = pemilikBaru;
        if (pemilikBaru != null && pemilikBaru.getKendaraan() != this) {
            pemilikBaru.setKendaraan(this);
        }
    }
 }