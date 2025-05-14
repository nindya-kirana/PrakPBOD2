/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nindy
 */
public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }
    @Override
    public void gerak() {
        System.out.println("Anjing bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung: cuit cuit~");
    }  
}
