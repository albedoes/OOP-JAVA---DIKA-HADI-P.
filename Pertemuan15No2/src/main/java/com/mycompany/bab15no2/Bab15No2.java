/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15no2;

/**
 *
 * @author iMOp
 */
import kalkulatorPack.*;

public class Bab15No2 {

    public static void main(String[] args) {
        kalkulatorTambah obj1 = new kalkulatorTambah();
        System.out.println(obj1.tambah(22,23));
        
        kalkulatorKurang obj2 = new kalkulatorKurang();
        System.out.println(obj2.kurang(32,23));
        
        kalkulatorKali obj3 = new kalkulatorKali();
        System.out.println(obj3.kali(8, 4));
        
        kalkulatorBagi obj4 = new kalkulatorBagi();
        System.out.println(obj4.bagi(20, 10));
    }
}
