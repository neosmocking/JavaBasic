package com.tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

      

        // Membuat perhitungan menghitung Luas persegi panjang
        // Luas = panjang x lebar
        System.out.println("MENGHITUNG LUAS");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("Volume = " +volume);





    }
}
