/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no1;

/**
 *
 * @author dikah
 */
import java.util.Scanner;

public class Pertemuan5No1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("### Pendataan Karyawan PT. Petani kode ###");
        
        System.out.print("Nama Karyawan : ");
        String name = input.nextLine();
        
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        
        System.out.print("Usia : ");
        int usia = input.nextInt();
        
        System.out.print("Gaji : ");
        int gaji = input.nextInt();
        
        input.close();
        
        System.out.println("----------------------");
        System.out.println("Nama Karyawan :" + name);
        System.out.println("Alamat :" + alamat);
        System.out.println("Usia :" + usia + " Tahun");
        System.out.println("Gaji : Rp. " + gaji);

       
    }
}
