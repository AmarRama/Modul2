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
public class UjiPraktikum1 {
    public static void main(String[] arg) {

        praktikum1 Bus = new praktikum1(20);

        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();

        Bus.addPenumpang(2);
        Bus.cetakPenumpang();

        Bus.addPenumpang(1);
        Bus.cetakPenumpang();

        Bus.addPenumpang(2);
        Bus.cetakPenumpang();

        Bus.addPenumpang(7);
        Bus.cetakPenumpang();
        
        
        Bus.getAverage();

    }


}
