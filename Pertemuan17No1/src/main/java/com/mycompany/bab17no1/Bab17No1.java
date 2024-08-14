/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17no1;

/**
 *
 * @author iMOp
 */
import java.util.Scanner;

public class Bab17No1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Kota : 4");
        int jumlahKota = myInput.nextInt();
        
        String[] kota;
        kota = new String[jumlahKota];
        
        System.out.print("Kota ke 1 : ");
        kota[0] = myInput.nextLine();
        
        System.out.print("Kota ke 2 : ");
        kota[1] = myInput.nextLine();
        
        System.out.print("Kota ke 3 : ");
        kota[2] = myInput.nextLine();
        
        System.out.print("Kota ke 4 : ");
        kota[3] = myInput.nextLine();
        
        System.out.println("Kota - Kota yang dimasukan");

        System.out.println(kota[0]);
        System.out.println(kota[1]);
        System.out.println(kota[2]);
        System.out.println(kota[3]);
    }
}
