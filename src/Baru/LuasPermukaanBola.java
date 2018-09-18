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

public class LuasPermukaanBola {

    public static void main(String[] args) {

        System.out.print("Program Menghitung Luas Permukaan Bola: ");

        Scanner input = new Scanner(System.in);
        double jari = input.nextDouble();
        System.out.println("Luas Permukaan bola adalah " + jari * jari * 22 / 7 * 4);
    }
}
