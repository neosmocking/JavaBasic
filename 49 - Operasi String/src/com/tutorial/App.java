package com.tutorial;

import java.util.Scanner;
import java.lang.String;

public class App {
    public static void main(String[] args) {
        String kalimat = "Saya Suka Makan Daging Sapi";

        // mengambil komponen dari stirng

        System.out.println(kalimat.charAt(5));

        // Substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);
        
        // concatenation (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);
        
        kata = kata + " cireng";
        System.out.println(kata);
        
        // concat dengan non string
        int jumlah = 20;
        String kalimant3 = kata + " " + jumlah; // casting
        System.out.println(kalimant3);
        System.out.println(kata + " " + jumlah);
        
        // lowercase dan UPPERCASE
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        // Replace
        String kalimat4 = kalimat.replace("Sapi","Banteng");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // Compare
        String motor1 = "supra otok-otok";
        String motor2 = "kawasaki ninja";
        System.out.println(motor1.compareTo(motor2)); // klmnopqrs
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));



        // equality (persamaan)
        String kataInput = "test"; // ini ada di string pool
        // String kataInput = new String("test"); // ini bukan string literal
        String kataTest = "test"; // ini juga ada di string pool

        System.out.println("\nPersamaan pada lokasi string pool");
        if (kataInput == kataTest){
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nMengambil unput string dari user: ");
        kataInput = userInput.next(); // tidak di string pool
        System.out.println("ini adalah input user: " + kataInput);
        
        if (kataInput.equals(kataTest) ){
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }






    }   
}
