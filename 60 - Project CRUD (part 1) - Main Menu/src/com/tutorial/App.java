package com.tutorial;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan){
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");
    
            System.out.print("\n\nPilihan Anda: ");
            pilihanUser = terminalInput.next();
    
            switch (pilihanUser) {
                case "1": 
                System.out.println("\n=================");
                System.out.println("LIST SELURUH BUKU");               
                System.out.println("=================");
                tampilkanData();
                // Tampilkan data
                break;                
                case "2": 
                // cari data               
                    System.out.println("\n=================");
                    System.out.println("CARI BUKU");   
                    System.out.println("=================");            
                    break;                    
                case "3":
                    // tambah data         
                    System.out.println("\n=================");
                    System.out.println("TAMBAH DATA BUKU");  
                    System.out.println("=================");             
                break;
                case "4":         
                    // ubah data
                    System.out.println("\n=================");       
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("=================");               
                break;
                case "5":                
                    // hapus data
                    System.out.println("\n=================");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("=================");               
                    break;
            
                default:
                System.err.println("\nInput anda tidak diteukan \nSilahkan pilih [1-5]");
                    break;
            }
                     
            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }
        
        
    }
    
    private static void tampilkanData() throws IOException{
        System.out.println("kita akan menampilkan data di sini");
        
        boolean isTambah = getYesorNo("Apakah Anda ingin menambah data");
        
    }

    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);        
        System.out.print("\n"+message+" (y/n)?");
        String pilihanUser = terminalInput.next();
        
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)?");
            pilihanUser = terminalInput.next();

        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}
