/* Nama file  : Garis.java
 * Deskripsi  : berisi atribut dan method dalam class garis
 * Pembuat    : MUHAMMAD YAZID LUBIS / 24060123140170
 * Tanggal    : 20 Februari 2025
 */

public class Garis {
    /************Atribut**********/
    Titik TAwal;
    Titik TAkhir;
    static int countgaris;

    /***********Method************/
    Garis(){
        TAwal = new Titik();
        TAkhir = new Titik(1, 1);
        countgaris++;
    }

    /*******KONSTRUKTOR dengan parameter masukan titik awal dan titik akhir*******/
    Garis(Titik TAwal, Titik TAkhir) {
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        countgaris++;
    }

    /******** SELEKTOR (getter) BESERTA MUTATOR (setter) **********/
    Titik getTAwal() {
        return TAwal;
    }

    void setTAwal(Titik TAwal) {
        this.TAwal = TAwal;
    }

    Titik getTAkhir() {
        return TAkhir;
    }

    void setTAkhir(Titik TAkhir) {
        this.TAkhir = TAkhir;
    }

    /********* SELEKTOR GetCounterGaris **********/
    static int getCountGaris() {
        return countgaris;
    }
    /********* Method untuk mendapatkan panjang sebuah garis *******/
    double getPanjang() {
        return TAwal.getJarak(TAkhir);
    }
    /********* Method untuk mendapatkan gradien sebuah garis *******/
    double getGradien() {
        return (TAkhir.getOrdinat() - TAwal.getOrdinat()) / (TAkhir.getAbsis() - TAwal.getAbsis());
    }
    /********* Method untuk mendapatkan titik tengan pada sebuah garis *******/
    Titik getTitikTengah() {
        double Xtengah = (TAwal.getAbsis() + TAkhir.getAbsis()) / 2;
        double Ytengah = (TAwal.getOrdinat() + TAkhir.getOrdinat()) / 2;
        return new Titik(Xtengah, Ytengah);
    }

    /******** Method untuk mengecek apakah garis sejajar atau tegak lurus *********/
    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }
    /************ Method untuk menampilkan ke layar ****************/
    void printGaris() {
        System.out.println("Titik Awal: (" + TAwal.getAbsis() + ", " + TAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + TAkhir.getAbsis() + ", " + TAkhir.getOrdinat() + ")");
    }

    String getPersamaanGaris() {
        double m = getGradien();
        double c = TAwal.getOrdinat() - (m * TAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
