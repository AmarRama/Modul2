/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baru;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class BiodataDiri {

    
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
       
        String nama,Alamat, Lahir, Tgl, Jeniskelamin, Nis, Mottohidup;
       
        System.out.println();
        
        System.out.println("Bidodata Diri Anda                             ");
    
        System.out.println();
        System.out.println("Masukkan data anda dengan benar!");
        System.out.println();
        System.out.print("Nama           :");
        nama=scan.nextLine();
        System.out.print("Alamat         :");
        Alamat=scan.nextLine();
        System.out.print("Tempat Lahir   :");
        Lahir=scan.nextLine();
        System.out.print("Tanggal Lahir  :");
        Tgl=scan.nextLine();
        System.out.print("Jenis Kelamin  :");
        Jeniskelamin=scan.nextLine();
        System.out.print("NIS            :");
        Nis=scan.nextLine();
        System.out.print("Motto Hidup    :");
        Mottohidup=scan.nextLine();
    }
}