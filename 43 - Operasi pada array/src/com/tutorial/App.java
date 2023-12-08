package com.tutorial;

import java.util.Arrays;

public class App {    
    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\nMerubah array menjadi string");
        System.out.println("===========================");
        printArray(arrayAngka1);
        
        //mengkopi array
        System.out.println("\nMengkopi array");
        System.out.println("===========================");
        int [] arrayAngka2 = new int [5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("\nmengkopi dengan loop");
        for (int i=0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);    
        
        System.out.println("\n mengokpopi dengan copyOf");
        int [] arrayAngka3 = Arrays.copyOf(arrayAngka1, 4);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        System.out.println("\nMengkopi dengan copyOfRange");
        int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        // fill array
        System.out.println("\nFill array");
        System.out.println("===========================");
        int [] arrayAngka5 = new int [10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);
        
        // komparasi array
        System.out.println("\nKomparasi array");
        System.out.println("===========================");
        
        int [] arrayAngka6 = {1,2,3,4,8};
        int [] arrayAngka7 = {1,2,3,4,7};
        
        if (Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini beda");
        }
        
        System.out.println("\nMembandingkan mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));;
        
        System.out.println("\nMengecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));;
        
        // Sort array
        System.out.println("\nSort array\n===========================");
        int [] arrayAngka8 = {1,6,4,5,3,8,2,7};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // Search array
        System.out.println("\nSearch array\n===========================");
        int angka = 8;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka "+angka+" ada di index "+posisi);

        // tugas --> sort kebalik
        // operasi tamah antara dua buah array
        // menggabungkan dua buah array
     
             
              
        
    }
    
    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));        
    }
}
