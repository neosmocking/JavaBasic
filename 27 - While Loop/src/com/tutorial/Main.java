package com.tutorial;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // while (condition) {
        //     aksi
        // }
        int a = 0;
        boolean kondisi = true;

        System.out.println("Awal Program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);
           
            if (a == 10){

                kondisi = false;
            }
            a++;
        }

        System.out.println("Akhir dari program");


    }
}
