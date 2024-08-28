/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Pertemuan14no2;

/**
 *
 * @author dikah
 */
public class Pertemuan14No2 extends AbstrakHewan{


    public void suara() {
        System.out.println("Suara Burung mencicit");

    }
    
    public static void main(String[] args) {
        AbstrakHewan objek = new Pertemuan14No2();
        objek.suara();
    }
    }
