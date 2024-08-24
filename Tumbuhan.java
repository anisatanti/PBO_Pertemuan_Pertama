/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuanpertama;

/**
 *
 * @author LENOVO
 */
public class Tumbuhan extends MakhlukHidup {
    private String warnaDaun;
    private String arahDaun;
    private int jumlahKepingBiji;
    
    public void setWarnaDaun(String warna){
        this.warnaDaun = warna;
    }
    public String getWarnaDaun(){
        return this.warnaDaun;
    }
    public void setArahDaun(String arah){
        this.arahDaun = arah;
        
    }public String getArahDaun(){
        return this.arahDaun;
    }
    public void setjumlahKepingBiji(int jumlah){
        this.jumlahKepingBiji = jumlah;
    }
    public int getjumlahKepingBiji(){
        return this.jumlahKepingBiji;
    }

}
