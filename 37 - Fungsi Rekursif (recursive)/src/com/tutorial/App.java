package com.tutorial;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
                
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nilai = ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = "+ nilai);

        printNilai(nilai);      
        int jumlah = jumlahNilai(nilai);
        System.out.println("hasil jumlah = " + jumlah);
        int faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);
        
    }
    
    // fungsi rekursif sederhana

    private static int jumlahNilai(int parameter){
        System.out.println("parameter "+ parameter);

        if (parameter == 0){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }
    
    private static int hitungFaktorial(int parameter){
        System.out.println("parameter "+ parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }

    public static void printNilai (int parameter){    
        System.out.println("nilai =" + parameter);
        
        if (parameter == 0){
            return;
        }

        parameter--;
        
        printNilai(parameter);
    }
}
