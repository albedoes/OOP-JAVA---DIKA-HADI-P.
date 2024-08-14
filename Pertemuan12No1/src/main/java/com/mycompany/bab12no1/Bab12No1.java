/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab12no1;

/**
 *
 * @author iMOp
 */

public class Bab12No1 extends Pegawai{
    
    int bonus = 1000000;
    int gajiTotal = gaji + bonus + tunjanganMakan + transport;
    
    public static void main(String[] args) {
        Bab12No1 sa = new Bab12No1();
        System.out.println("Gaji SystemAnalyst : "+ sa.gaji);
        System.out.println("Bonus : " + sa.bonus);
        System.out.println("Tunjangan makan : " + sa.tunjanganMakan);
        System.out.println("Transport : " + sa.transport);
        System.out.println("Gaji Total : " + sa.gajiTotal);
    }
}
