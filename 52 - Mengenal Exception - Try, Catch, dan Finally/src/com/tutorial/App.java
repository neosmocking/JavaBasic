package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.printf("nilai array ke: ");
        int index = userInput.nextInt();
        
        // exception handling (try, catch, finally)
        System.out.println("\nHandling out of bound");
        try {
            System.out.printf("index ke %d, adalah %d\n",index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        
        // runtime error jika file tidak ada        
        System.out.println("\nHandling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e){
            System.err.println(e);
        }
        
        // menggabungkan dua exception
        System.out.println("\nMenggabungkan dua buah exception");        
        try {
            System.out.printf("index ke %d, adalah %d\n",index,array[index]);
            fileInput = new FileInputStream("input.txt");
            
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang anda masukan tidak sesuai dengna jumlah array");
        } catch (IOException e){
            System.err.println("File tidak ditemukan");
        }
        
        // finally
        System.out.println("\nMenambahkan finally");
        
        try {
            System.out.printf("index ke %d, adalah %d\n",index,array[index]);           
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang anda masukan tidak sesuai dengna jumlah array");
        } finally {
            System.out.println("finally");
        }


        System.out.println("\nakhir dari program");
    }
}
