/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab11no2;

/**
 *
 * @author iMOp
 */
public class Karyawan {
    int id, gajiPokok, gol;
    String nama, jabatan;
    
    void setKaryawan(int id, String nama, int gol, String jabatan, int gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.gol = gol;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    } 
    
    void getKaryawan() {
        System.out.println("ID Karyawan : " + id);
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan : " + gol);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}
