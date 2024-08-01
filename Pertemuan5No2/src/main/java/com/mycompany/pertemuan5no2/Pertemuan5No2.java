/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no2;

/**
 *
 * @author dikah
 */
import java.util.Scanner;

public class Pertemuan5No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Alas : ");
        double alas = input.nextDouble();
        
        System.out.print("Masukan Tinggi : ");
        double tinggi = input.nextDouble();
        
        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga : " + luas);
        
        input.close();
    }
}