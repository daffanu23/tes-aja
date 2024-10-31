/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bmi;

/**
 *
 * @author Daffa
 */
public class BMIBeraksi {
    public static void main(String[] args) {
       BMI daffa = new BMI (76, 177);
       daffa.hitung();
       System.out.println("Nilai BMI: " + daffa.getBMI());
    }
}
