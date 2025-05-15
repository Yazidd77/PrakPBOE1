// nama file : Datum.java
// deskripsi : datum sebagai penampung berbagai objek
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 15 mei 2025

class Datum<T> {
    private T isi;

    public Datum(T isi){
        this.isi = isi;
    }

    public Datum() {
        this.isi = null;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi){
        this.isi = isi;
    }
}
