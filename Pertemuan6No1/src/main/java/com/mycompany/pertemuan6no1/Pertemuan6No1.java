/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6no1;

/**
 *
 * @author dikah
 */
import java.util.Scanner;

public class Pertemuan6No1 {

public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
 System.out.print("NIM: ");
 int nim = input.nextInt();
 
 input.nextLine();
 
 System.out.print("Nama: ");
 String nama = input.nextLine();
 
 System.out.print("Nilai: ");
 int nilai = input.nextInt();
 
  input.close();

        if (nilai>85) {
     System.out.println("Grade A ");
 } else if (nilai>75) {
     System.out.println("Grade B ");
 } else if (nilai>65) {
     System.out.println("Grade C ");
 } else if (nilai>50) {
     System.out.println("Grade D");
 } else if (nilai>25) {
     System.out.println("Grade E");
 } else if (nilai<25) {
     System.out.println("Grade F");
 }
 }
}
