package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        // nested if atau if bersarang

        int a = 6;
        int b = 10;
        
        System.out.println("ini adalah awal dari program");

        if (a == 5){

            if (b == 10){

                System.out.println("ini adalah dimana a = 5 an b = 10");

            } else {

                System.out.println("ini adalah dimana a = 5 dan b bukan 10");

            }

        } else {

            System.out.println("ini adalah dimana a dan b salah");

        }
                       
        System.out.println("ini adalah akhir dari program");

    }
}
