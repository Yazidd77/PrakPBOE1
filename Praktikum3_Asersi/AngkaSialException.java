/* Nama file  : AngkaSialException.java
 * Deskripsi  : eksepsi buatan sendiri yang menolak angka 13
 * Pembuat    : MUHAMMAD YAZID LUBIS / 24060123140170
 * Tanggal    : 6 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan memasukan angka 13 karena angka ini sial!!");
    }
}
