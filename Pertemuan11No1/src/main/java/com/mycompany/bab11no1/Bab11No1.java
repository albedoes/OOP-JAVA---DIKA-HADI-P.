/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11no1;

/**
 *
 * @author iMOp
 */

public class Bab11No1 {

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(0001, "Agus", "A", "Manager", 4000000);
        karyawan1.getKaryawan();
        
        Karyawan karyawan2 = new Karyawan();
        karyawan2.setKaryawan(0002, "udin", "B", "Supervisor", 7000000);
        karyawan2.getKaryawan();
    }
}
