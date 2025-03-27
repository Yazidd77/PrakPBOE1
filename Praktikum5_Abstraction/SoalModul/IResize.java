// nama file    : IResize.java
// deskripsi    : program ini berisi IResize
// pembuat      : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal      : 20 Maret 2025

public interface IResize{
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}