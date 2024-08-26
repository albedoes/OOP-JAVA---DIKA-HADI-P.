/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Pertemuan14No1;

/**
 *
 * @author dikah
 */

public class Pertemuan14No1 extends abstrakHewan{
    public void suara() {
        System.out.println("Suara burung mencicit");
    }
    
    public static void main(String[] args) {
        abstrakHewan objek = new Pertemuan14No1();
        objek.suara();
        objek.suara2();
    }
}
