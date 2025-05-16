/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MainKoleksiAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();

        koleksiAnabul.add(new Kucing("Acchan"));
        koleksiAnabul.add(new Anjing("maririn"));
        koleksiAnabul.add(new Burung("Tomochin"));
        koleksiAnabul.add(new Anjing("Aoba"));
        koleksiAnabul.add(new Kucing("Mydeimos"));
        koleksiAnabul.add(new Kucing("hiiragi"));
        koleksiAnabul.add(new Burung("shin"));
        koleksiAnabul.add(new Kucing("yuki"));
        koleksiAnabul.add(new Burung("chiba"));
        koleksiAnabul.add(new Anjing("tomo"));

        koleksiAnabul.showAll();
    } 
}
