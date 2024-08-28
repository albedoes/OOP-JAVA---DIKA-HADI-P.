/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Pertemuan14No1;

/**
 *
 * @author dikah
 */

public class Pertemuan14No1 extends AbstrakHewan{
    public void suara() {
        System.out.println("Suara burung mencicit");
    }
    
    public static void main(String[] args) {
        AbstrakHewan objek = new Pertemuan14No1();
        objek.suara();
        objek.suara2();
    }
}
