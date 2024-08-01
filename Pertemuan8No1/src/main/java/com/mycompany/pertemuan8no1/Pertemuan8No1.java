/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8no1;

/**
 *
 * @author dikah
 */
import java.util.Scanner;

public class Pertemuan8No1 {

public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.print("NILAI AWAL?:");
     int AWAL = input.nextInt();
     
     System.out.print("NILAI AKHIR?:");
     int AKHIR = input.nextInt();
    
     
     int counter = 1;
     
        for (int nilai = AWAL; nilai <= AKHIR; nilai+=5 ) {
                System.out.println( counter + ". " + nilai);
                counter++;
            }
        }
 }

