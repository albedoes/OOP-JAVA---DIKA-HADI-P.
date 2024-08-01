/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9no2;

/**
 *
 * @author dikah
 */
import java.util.Scanner;

public class Pertemuan9No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan bilangan awal: ");
        int bilanganAwal = scanner.nextInt();

        System.out.print("Masukan bilangan akhir: ");
        int bilanganAkhir = scanner.nextInt();

        System.out.print("Hasil deret bilangan: ");
        for (int i = bilanganAwal; i <= bilanganAkhir; i += 5) {
            if (i != bilanganAwal) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println(); 
    }
}
