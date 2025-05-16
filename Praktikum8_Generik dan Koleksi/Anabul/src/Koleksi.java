/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Koleksi<T> {
    private final ArrayList<T> wadah;
    private int nbelm; 

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int x) {
        this.nbelm = x;
    }

    public T getIsi(int indeks) {
        return wadah.get(indeks);
    }

    public void setIsi(int indeks, T e) {
        wadah.set(indeks, e);
    }

    public void add(T e) {
        wadah.add(e);
        nbelm++;
    }

    public T delete() {
        T e = wadah.get(nbelm - 1);
        wadah.remove(nbelm - 1);
        nbelm--;
        return e;
    }
    
    public void showAll() {
        System.out.println("Isi Koleksi: ");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("-> " + wadah.get(i));
        }
    }
}