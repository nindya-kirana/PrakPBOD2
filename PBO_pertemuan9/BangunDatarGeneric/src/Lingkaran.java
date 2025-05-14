/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nindy
 */
public class Lingkaran extends BangunDatar {
    private double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    @Override
    public double hitungKeliling(){
        return 2*jejari*Math.PI;
    }
    @Override
    public double hitungLuas(){
        return Math.PI*jejari*jejari;
    }
}
