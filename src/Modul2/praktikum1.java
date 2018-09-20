/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

import java.util.*;
/**
 *
 * @author Pahuger_Puruhita
 */
public class praktikum1 {

    public int penumpang;
    public int maxPenumpang;
    private double average;
    private double jumlahP,beratP;

    

    public praktikum1(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang) {

        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");

        } else {
            this.penumpang = temp;
        }
    }

    public void getPenumpang(int password) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan password :");
        password = s.nextInt();
        
        if (password == 02) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
        
    }

    public void cetakPenumpang() {
        System.out.println("Penumpang bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxPenumpang);
    }

    public double getAverage() {
        Scanner s = new Scanner (System.in);
        System.out.println("masuakan jumlah :");
        jumlahP= s.nextDouble();
        System.out.println("masukan berat keseluruhan :");
        beratP= s.nextDouble();
       
        average = (beratP-500)/jumlahP;
        System.out.println("rata-rata berat:"+average);
        return average;
    }
    

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public void setJumlahP(double jumlahP) {
        this.jumlahP = jumlahP;
    }

    public void setBeratP(double beratP) {
        this.beratP = beratP;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public int getMaxPenumpang() {
        return maxPenumpang;
    }

   
    

}