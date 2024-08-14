/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15no1;
/**
 *
 * @author iMOp
 */
import kalkulatorPack.Kalkulator;

public class Bab15No1 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        int tambah = kalkulator.tambah(22, 23);
        System.out.println(tambah);
             
        int kurang = kalkulator.kurang(30, 12);
        System.out.println(kurang);
        
        int bagi = kalkulator.bagi(20, 4);
        System.out.println(bagi);
        
        int kali = kalkulator.kali(8, 4);
        System.out.println(kali);
    }
}
