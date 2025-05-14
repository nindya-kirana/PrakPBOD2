/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nindy
 */
public class Segitiga extends BangunDatar{
    private double sisi1;
    private double sisi2;
    private double sisi3;    
    
    public Segitiga(double sisi1, double sisi2, double sisi3){
        if((sisi1<(sisi2+sisi3)) && (sisi2<(sisi1+sisi3)) && (sisi3<(sisi1+sisi2))){
          this.sisi1 = sisi1;
          this.sisi2 = sisi2;
          this.sisi3 = sisi3;  
        }
        else{
            System.out.println("Sisi - sisi tersebut tidak dapat memebentuk segitiga");
        }
    }
    @Override
    public double hitungKeliling(){
        return sisi1 + sisi2 + sisi3;
    }
    @Override
    public double hitungLuas(){
        double s = this.hitungKeliling()/2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
}
