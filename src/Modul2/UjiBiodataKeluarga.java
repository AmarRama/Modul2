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
public class UjiBiodataKeluarga {
    public static void main (String args [] ){
        
        BiodataKeluarga biodata= new BiodataKeluarga();
        
        biodata.setNamaAyah("Muhammad Agus Salim");
        biodata.setNamaIbu("Rieswanti Rini Sunning K");
        biodata.setNamaSaudara("Aina Hafsah");
        biodata.setNamaSaya("Abiyu Fauzan Amar Ramadhani");
        biodata.setAlamat("Jl.Pesona Ikan Mas Kav.07, Malang");
        biodata.setTempatLahir("Malang");
        biodata.setTanggalLahir("29 11 2002");
        biodata.setHobi("Sepak Bola");
        biodata.setCitaCita("Programer");
        biodata.setNoTelepon("083848808060");
        
        System.out.println("Nama Ayah : " + biodata.getNamaAyah());
        System.out.println("Nama Ibu : " + biodata.getNamaIbu());
        System.out.println("Nama Saudara : " + biodata.getNamaSaudara());
        System.out.println("Nama Saya : " + biodata.getNamaSaya());
        System.out.println("Alamat :" + biodata.getAlamat());
        System.out.println("Tempat Lahir :" + biodata.getTempatLahir());
        System.out.println("Tanggal Lahir :" + biodata.getTanggalLahir());
        System.out.println("Hobi :" + biodata.getHobi());
        System.out.println("Cita Cita :" + biodata.getCitaCita());
        System.out.println("No Telepon :" + biodata.getNoTelepon());
        
        
        
    }
    
}
