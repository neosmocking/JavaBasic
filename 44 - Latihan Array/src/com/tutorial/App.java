package com.tutorial;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arrayAngka1 = {2,3,5,13,19,4,7,8};
        int[] arrayAngka2 = {2,18,12,8,3,1,0,9};
        
        // penjumlahan antara dua buah array
        
        int [] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil1, "Hasil 1");
        
        // Menggabungkan dua buah array
        int [] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        
        for (int i = 0; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i =0; i < arrayAngka2.length; i++){
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil2, "Hasil 2");

        // Sorting reverse, mengurutkan tapi kebalik

        printArray(arrayAngka1, "Array 1");                
        reverse(arrayAngka1);
        printArray(arrayAngka1, "Reverse 1");
        
        printArray(arrayAngka2, "Array 2");                
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "Reverse 2");
    }

    private static void reverse2 (int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2;i++){
            buffer = dataArray[i];
            dataArray [i] = dataArray[(dataArray.length -1) - i];
            dataArray[(dataArray.length -1) - i] = buffer;
        }
         
    }

   
    private static void reverse (int[] dataArray){
        Arrays.sort(dataArray);
        int [] arrayBuffer =  Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length -1) - i];
        }         
        
    }
    
    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil1 = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++){
            arrayHasil1[i] = arrayInt1[i]+arrayInt2[i];
        } 
        return arrayHasil1;

    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = "+Arrays.toString(dataArray));
    }
}
