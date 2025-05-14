/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nindy
 */
import java.util.Random;
public class Main {
    public static void main(String args[]){
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<>();
        Random rand = new Random();
        
        String[] daftarNama={"Mochi", "Galaxy Annihilator", "Atroid Destroyer", "Mini cupcake", "John the 11th",
                                "Louis", "Courage", "Hades lil son", "Void", "Ballerinna Cappucina"};
        
        for(int i = 0; i<10; i++){
            int jenis = rand.nextInt(3);
            String nama = daftarNama[i];
            
            switch (jenis){
                case 0:
                    koleksi.tambahAnabul(new Kucing(nama));
                    break;
                case 1:
                    koleksi.tambahAnabul(new Anjing(nama));
                    break;
                case 2:
                    koleksi.tambahAnabul(new Burung(nama));
                    break;
            }
        }
        koleksi.showAll();
    }
}
