/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author WINDOWS 10
 */

public class Latihan01UjiBus {
    public static void main (String[] arg) {
        Latihan01 busMini = new Latihan01();
        
        
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        busMini.cetak();
        busMini.penumpang = busMini.penumpang + 5;
        
        busMini.cetak();
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
    }    
}
