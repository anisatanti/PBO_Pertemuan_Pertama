/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuanpertama;

/**
 *
 * @author LENOVO
 */
public class Hewan extends MakhlukHidup {
    
    private int jumlahKaki;
    private String alatGerak;
    

    public void setjumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    public int getjumlahKaki(){
        return this.jumlahKaki;
    }
    public void setalatGerak(String alatGerak){
        this.alatGerak = alatGerak;
    }
    public String getalatGerak(){
        return this.alatGerak;
    }
    
}
