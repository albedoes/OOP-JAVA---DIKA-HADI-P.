/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10no2;

/**
 *
 * @author dikah
 */
public class Pertemuan10No2 {

    public static void main(String[] args) {
    Aritmatika1 aritmatikaku = new Aritmatika1();
        int bilangan1 = 11, bilangan2 = 22;
        
        System.out.println("Bilangan 1= " + bilangan1);
        System.out.println("Bilangan 2= " + bilangan2);

        aritmatikaku.setPengurangan(bilangan1, bilangan2);
        System.out.println("Hasil Pengurangan " + aritmatikaku.getAngka());

        aritmatikaku.setPerkalian(bilangan1, bilangan2);
        System.out.println("Hasil Perkalian " + aritmatikaku.getAngka());

        aritmatikaku.setPembagian(bilangan1, bilangan2);
        System.out.println("Hasil Pembagian " + aritmatikaku.getAngka());

        aritmatikaku.setPangkat(bilangan1, bilangan2);
        System.out.println("Hasil Pangkat " + aritmatikaku.getAngka());
    }
}
