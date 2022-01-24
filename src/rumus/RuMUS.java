/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumus;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RuMUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner pilih = new Scanner(System.in);
        int plh;

        salam();
        System.out.println("=================");
        System.out.println("Pilih Rumus");
        System.out.println("1.Rumus Segitiga");
        System.out.println("2.Rumus Lingkaran");
        System.out.println("3.Rumus Persegi");
        System.out.println("4.Rumus Persegi Panjang");
        System.out.println("=================");
        System.out.print("Pilih :");
        plh = pilih.nextInt();
        if (plh == 1) {
            System.out.println("rumus segitiga :" + rumus_segitiga());

        } else if (plh == 2) {
            System.out.println("rumus limgkaran :" + rumus_lingkaran());

        } else if (plh == 3) {
            System.out.println("rumus persegi :" + rumus_persegi());

        } else if (plh == 4) {
            System.out.println("rumus persegi panjang :" + rumus_persegi_panjang());

        } else {
            System.out.println("Maaf Error");
        }

    }

    public static void salam() {

        System.out.println("Selamat datang di rumus matematika");

    }

    public static String rumus_segitiga() {

        String rumus = "1/2*alas*tinggi";

        return rumus;
    }

    public static String rumus_lingkaran() {

        String rumus = "phi*r*r";

        return rumus;

    }

    public static String rumus_persegi() {

        String rumus = "s*s";

        return rumus;

    }

    public static String rumus_persegi_panjang() {

        String rumus = "p*l";

        return rumus;

    }
    
    
    
    

}