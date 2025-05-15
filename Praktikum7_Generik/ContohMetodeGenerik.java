// nama file : ContohMetodeGenerik.java
// deskripsi : kode program ContohMetodeGenerik
// pembuat   : MUHAMMAD YAZID LUBIS // 24060123140170
// tanggal   : 15 mei 2025


class ContohMetodeGenerik {
    public <T> void displayDatumInfo(Datum<T> datum){
        if (datum.getIsi() != null ){
            System.out.println("Datum berisi objek dari kelas: " + datum.getIsi().getClass().getSimpleName());

        } else {
            System.out.println("Datum tidak berisi objek (null)");

        }
    }

    public <T> void setNewValue(Datum<T> datum, T newValue){
        datum.setIsi(newValue);
        System.out.println("Nilai baru telah diset ke dalam Datum");

    }

    public <T extends Anabul> void demonstrateAnabul(Datum<T> datum){
        if (datum.getIsi() != null){
            T anabul = datum.getIsi();
            System.out.println("Nama: " + anabul.getNama());
            anabul.bersuara();
            anabul.gerak();
        } else {
            System.out.println("Datum tidak berisi objek anabul");

        }
    }

    public <T, U> void compareDatum(Datum<T> datum1, Datum<U> datum2){
        System.out.println("Datum 1 berisi: " +
                            (datum1.getIsi() == null ? "null" : datum1.getIsi().getClass().getSimpleName()));
        System.out.println("Datum 2 berisi: " +
                            (datum2.getIsi() == null ? "null" : datum2.getIsi().getClass().getSimpleName()));
        if (datum1.getIsi() != null && datum2.getIsi() != null){
            boolean isSameClass = datum1.getIsi().getClass().equals(datum2.getIsi().getClass());
            System.out.println("Kedua Datum berisi objek dari kelas yang sama : " + isSameClass);
        }
    }
}
