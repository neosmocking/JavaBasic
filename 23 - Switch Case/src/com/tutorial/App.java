package com.tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // switch case

        
        String input;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("panggil nama: ");
        input = inputUser.next();
                
        // ekspresinya berupa satuan (int, long, byte, short), String, atau enum
        
        switch (input) {
            case "otong":
                System.out.println("saya otong dan hadir boss!!");
                break;
            case "ucup":                
                System.out.println("saya ucup dan hadir boss!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir boss!!");
                break;                
            default:
            System.out.println(input + " tidak hadir boss");
                break;
        }
        System.out.println("selesai program");

    }
}
