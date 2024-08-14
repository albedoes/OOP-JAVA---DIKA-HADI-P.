/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14no2;

/**
 *
 * @author iMOp
 */
public class Bab14No2 extends Hewan{

    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
    
    public static void main(String[] args) {
        Hewan objek = new Bab14No2();
        objek.suara();
    }
}
