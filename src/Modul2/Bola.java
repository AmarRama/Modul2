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



public class Bola {
    
   private double jarijari ;
   private double diameter;
   private double luas;
   private double volume;

   public void Jari(double jarijari){
   this.jarijari=jarijari;
   }
  
   public void Diameter(){
   this.diameter=2*jarijari;
   }
  
   public void Luas(){
   this.luas=4*Math.PI*jarijari*jarijari;
   }
  
   public void Volume(){
   this.volume=(4*Math.PI*jarijari*jarijari*jarijari)/3;
   }
  
   public void cetak(){
   System.out.println("Jari-jari : "+jarijari+ " cm   ");
   System.out.println("Diameter  : "+diameter+ " cm   ");
   System.out.println("Luas      : "+luas+" cm ");
   System.out.println("Volume    : "+volume+" cm ");
   }
   }


    

