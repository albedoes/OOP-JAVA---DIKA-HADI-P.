/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11no2;

/**
 *
 * @author iMOp
 */
import java.util.Scanner;

public class Bab11No2 {
    
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("ID Karyawan : ");
        int id = myInput.nextInt();
        myInput.nextLine();

        System.out.print("Nama Karyawan : ");
        String nama = myInput.nextLine();

        System.out.print("Gol : ");
        int gol = myInput.nextInt();

        String jabatan = "";
        int gajiPokok = 0;
        
        System.out.println("-----------------------------");
        
        switch (gol) {
            case 1:
                jabatan = "Asisten Staff";
                gajiPokok = 3000000;
                break;
            case 2:
                jabatan = "Staff";
                gajiPokok = 3500000;
                break;
            case 3:
                jabatan = "Supervisor";
                gajiPokok = 4000000;
                break;
            case 4:
                jabatan = "Asisten Manager";
                gajiPokok = 5000000;
                break;
            case 5:
                jabatan = "Manager";
                gajiPokok = 6000000;
                break;
            default:
                System.out.println("GOLONGAN YANG DIMASUKAN SALAH!!!");
                return;
        }

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(id, nama, gol, jabatan, gajiPokok);
        karyawan1.getKaryawan();
    }
}
