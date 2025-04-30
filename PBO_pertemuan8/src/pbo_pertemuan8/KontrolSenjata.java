/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuan8;

/**
 *
 * @author nindy
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    KontrolSenjata(Senjata S){
        this.senjata = S;
    }
    public boolean isAdaPeluru(){
        return senjata.getPeluru()>0;
    }
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " Kali");
        if(isAdaPeluru()){
            for(int i=0; i<jumlah; i++){
                if(isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                }
                else{
                    System.out.println("Gagal tembak, peluru habis");
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
        else{
            System.out.println("Peluru habis");
        }
    }
    public void menusuk(){
        if(senjata.isMenusuk()){
            System.out.println("Jleb jleb");
        }
        else{
            System.out.println("Bayonet belum terpasang");
        }
    }
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet sudah terpasang");
    }
}
