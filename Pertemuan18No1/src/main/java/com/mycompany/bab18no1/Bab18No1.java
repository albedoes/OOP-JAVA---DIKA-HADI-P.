/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18no1;

/**
 *
 * @author iMOp
 */
public class Bab18No1 {

//    Function cek umur
    public static void validate(int age) {
        if (age<17) {
            throw new ArithmeticException("DIBAWAH UMUR!!!");
        } else {
            System.out.println("SUDAH CUKUP UMUR!");
        }
    }

    public static void main(String[] args) {
//        THROW
        validate(13);
        System.out.println("rest of the code...");
        
//        TRYCATCH
        try {
            int data=50/0;
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
