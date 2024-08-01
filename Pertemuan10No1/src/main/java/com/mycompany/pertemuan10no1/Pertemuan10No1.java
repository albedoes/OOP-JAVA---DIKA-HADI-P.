/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10no1;

/**
 *
 * @author dikah
 */
public class Pertemuan10No1 extends Aritmatika3 {

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }

    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Pertemuan10No1 aritmatika = new Pertemuan10No1();
        
        int a = 5, b = 3;
        
        aritmatika.setTambah(a, b);
        System.out.println("Penjumlahan: " + aritmatika.getTambah());

        System.out.println("Pengurangan: " + aritmatika.pengurangan(a, b));
        System.out.println("Perkalian: " + aritmatika.perkalian(a, b));
        System.out.println("Pembagian: " + aritmatika.pembagian(a, b));
        System.out.println("Pangkat: " + aritmatika.pangkat(a, b));
    }
}
