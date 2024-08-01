/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10no2;

/**
 *
 * @author dikah
 */
public class Aritmatika1 {
     private double bilangan1;
    private double bilangan2;

    public Aritmatika1(double bilangan1, double bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    public double pengurangan() {
        return bilangan1 - bilangan2;
    }

    public double perkalian() {
        return bilangan1 * bilangan2;
    }

    public double pembagian() {
        if (bilangan2 != 0) {
            return bilangan1 / bilangan2;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }

    public double pangkat() {
        return Math.pow(bilangan1, bilangan2);
    }
}