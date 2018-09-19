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
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Amar");
        siswa.setAbsen(02);
        siswa.setAddress("Malang");
                
        System.out.println("Nama : " + siswa.getName()
        + " Absen : " + siswa.getAbsen() + " Address : " + siswa.getAddress());
              
        
    }
    
}
