/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nindy
 */
public class Persegi extends BangunDatar{
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
