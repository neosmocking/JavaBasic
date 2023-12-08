package com.tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kesimpulannya adalah
        // Perkalian dan pembagian akan dilakukan 
        // terlebih dahulu

        // Jika dilakukan perkalian dan pembagian, 
        // maka akan dilakukan operasinya dari kiri ke kanan

        int hasil = 3 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompkan operasi dengan ( )
        hasil = 60 / (2+10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;

        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradient m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("Nilai y = " + y);





    }
}
