/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab11no1;

/**
 *
 * @author iMOp
 */
public class Karyawan {
    int id, gajiPokok;
    String nama, jabatan, gol;
    
    void setKaryawan(int id, String nama, String gol, String jabatan, int gajiPokok) {
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
