/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuan8;

/**
 *
 * @author nindy
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return peluru;
    }
    public boolean isMenusuk(){
        return menusuk;
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
