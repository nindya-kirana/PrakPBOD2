/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nindy
 */
import java.util.ArrayList;

class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> koleksi;
    
    public KoleksiAnabul() {
        koleksi = new ArrayList<>();
    }
    
    public void tambahAnabul(T anabul) {
        koleksi.add(anabul);
    }
    
    public void showAll() {
        for (T anabul : koleksi) {
            System.out.println("Nama: " + anabul.getNama());
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
}

