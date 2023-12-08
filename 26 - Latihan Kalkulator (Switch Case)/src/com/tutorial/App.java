package com.tutorial;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat(); 
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat(); 

        switch (operator) {
            case "+":
                //penjumlahan
                hasil = a + b;                
                System.out.println("Hasil = "+ hasil);
                break;
                case "-":
                //pengurangan                
                hasil = a - b;                
                System.out.println("Hasil = "+ hasil);
                break;
                case "*":
                //perkalian                
                hasil = a * b;                
                System.out.println("Hasil = "+ hasil);
                break;
                case "/":
                //pembagian                
                hasil = a / b;                
                System.out.println("Hasil = "+ hasil);
                break;
        
            default:
            System.out.println("Operator " + operator + " tidak ditemukan!!");
                break;
        }





    }
}
