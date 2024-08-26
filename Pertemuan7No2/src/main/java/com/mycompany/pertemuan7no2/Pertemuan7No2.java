/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7no2;

/**
 *
 * @author dikah
 */
import java.util.Scanner;

public class Pertemuan7No2 {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
 System.out.print("NIM:");
 int NIM = input.nextInt();
 input.nextLine();
 System.out.print("Nama:");
 String NAMA = input.nextLine();
 System.out.print("Tahun:");
 int TAHUN = input.nextInt();
 input.nextLine();
 System.out.print("Pilih Peminatan:");
 char MINAT = input.next().charAt(0);
 
 
input.close();
 /*metode switch*/
 switch(TAHUN) {
            case 1:
                System.out.println("Bahasa Inggris, Matematika, Sain");
                break;
            case 2:
                switch(MINAT) {
                    case 'C':
                        System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
                        break;
                    case 'E':
                        System.out.println("Algoritma, Logika Informatika");
                        break;
                    case 'M':
                        System.out.println("DBMS, Manajemen Proyek");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                }
                break;
            case 3:
                switch(MINAT) {
                    case 'C':
                        System.out.println("Organisasi Komputer, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Perancangan Sistem, Pemrograman WEB");
                        break;
                    case 'M':
                        System.out.println("Pemrograman Mobile, Pemrograman Java 2");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                }
                break;
            case 4:
                switch(MINAT) {
                    case 'C':
                        System.out.println("Komunikasi Data, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Sistem Terdistribusi, Image Processing");
                        break;
                    case 'M':
                        System.out.println("SIM, Sistem Jaringan");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                }
                break;
            default:
                System.out.println("Tahun tidak valid.");
        }
    }
}
     
