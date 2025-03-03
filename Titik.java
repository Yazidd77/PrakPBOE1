/* Nama File : Titik.Java
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat : MUHAMMAD YAZID LUBIS
 * Tanggal : Kamis, 20 februari 2025
 */

public class Titik {
    /****************ATRIBUT*******************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /****************METHOD*******************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;

    }

//konstruktor untuk membuat dengan nilai absis dan ordinaat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;

    }
    //mengembalikan nilai counteTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getordinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setordinat(double y){
        ordinat =  y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y)
    {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik(" + absis + " , " + ordinat +")");
    }
    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);

    }
    void RefleksiX(){
        ordinat = ordinat*(-1);
    }







}//end class Titik
