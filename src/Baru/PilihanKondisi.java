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

public class PilihanKondisi {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Silahkan pilih angka 1-3 :");
        int bil = masukan.nextInt();
        switch (bil) {
            case 1:
                System.out.println("Satu");
                
                
            case 2:
                
                System.out.println("Dua");
                
              
            case 3:
         
                System.out.println("Tiga");
break;
        }
    }

}
