/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorPack;

/**
 *
 * @author iMOp
 */
public class Kalkulator {
    protected double tambah(double a, double b){
        return a + b;
    }
    
    public double getTambah(double a, double b) {
       return tambah(a, b);
    }
    
    protected double kurang(double a, double b) {
        return a - b;
    }
    
    public double getKurang(double a, double b) {
       return kurang(a, b);
    }
    
    protected double bagi(double a, double b) {
        return a / b;
    }
    
    public double getBagi(double a, double b) {
       return tambah(a, b);
    }
    
    public double kali(double a, double b) {
        return a * b;
    }
    
    public double getKali(double a, double b) {
       return kali(a, b);
    }
}
