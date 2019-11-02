/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan42.tabungan;

/**
 *
 * @author Kiyo
 */
public class Tabungan {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        int sisa;
        return saldo - jumlah;
        
    }

}
