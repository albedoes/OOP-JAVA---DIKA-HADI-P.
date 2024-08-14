/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18no2;

/**
 *
 * @author iMOp
 */
public class Bab18No2 {

    public static void main(String[] args) {
        try { 
         float data= 500 / 15; 
         System.out.println(data); 
        } catch(NullPointerException e) {
         System.out.println(e); 
        }
        
        finally { 
         System.out.println("blok finally akan selalu di eksekusi ");
        }
    }
}
