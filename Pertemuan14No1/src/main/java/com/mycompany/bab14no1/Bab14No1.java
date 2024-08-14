/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14no1;

/**
 *
 * @author iMOp
 */

public class Bab14No1 extends abstrakHewan{
    public void suara() {
        System.out.println("Suara T-rex RAWWRR!!!");
    }
    
    public static void main(String[] args) {
        abstrakHewan objek = new Bab14No1();
        objek.suara();
        objek.suara2();
    }
}
