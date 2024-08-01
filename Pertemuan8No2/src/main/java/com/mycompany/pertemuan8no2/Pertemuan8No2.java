/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8no2;

/**
 *
 * @author dikah
 */
import java.util.Scanner;

public class Pertemuan8No2 {

public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.print("TAHUN AKHIR?:");
     int AKHIR = input.nextInt();
     
     System.out.print("TAHUN AWAL?:");
     int AWAL = input.nextInt();
     
        for (int tahun = AKHIR; tahun >= AWAL; tahun-- ) {
                System.out.println(tahun);
            }
        }
 }
