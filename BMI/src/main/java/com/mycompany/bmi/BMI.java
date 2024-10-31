/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bmi;

/**
 *
 * @author Daffa
 */
public class BMI {
    int beratBadan;
    int tinggiBadan;
    int BMI;

    public BMI(int beratBadan, int tinggiBadan){
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }
     
    public void hitung (){
       double x = beratBadan / (tinggiBadan * 2 / 100);
        if (x < 18.5) {
        System.out.println("Anda masuk dalam kategori kurus");}
        else if (x >= 18.5 && x <= 24.9) {
        System.out.println("Anda masuk dalam kategori normal");}
        else if (x >= 25 && x <= 29.9) {
        System.out.println("Anda masuk dalam kategori berat badan berlebih");} 
        else {
        System.out.println("Anda masuk dalam kategori obesitas");}
    }
    
    int getBMI(){
        return BMI;
    }
}