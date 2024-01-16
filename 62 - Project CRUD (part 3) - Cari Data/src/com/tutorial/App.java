package com.tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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
                    cariData();
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

    private static void cariData() throws IOException {
        
        // membaca database ada atau tidak
        try {
            File file = new File("database.txt");            
        } catch (Exception e){
            System.out.println("Database tidak ditemukan");
            System.out.println("Silahkan tambah data terlebih dahulu");
            return;
        }
        // kita ambil keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();        
        String[] keywords = cariString.split("\\s+");
        
        // kita cek keyword di database\
        cekBukuDiDatabase(keywords);
    }
    
    public static void cekBukuDiDatabase(String[] keywords) throws IOException {
        
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist;
        int nomorData = 0;

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("---------------------------------------------------------------------------------------------");

        while (data != null) {
            // cek keywords didalam baris
            isExist = true;
           
            for (String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
          

            // jika kewordsnya cocok maka tampilkan
            

            if(isExist){
                nomorData ++;
                StringTokenizer stringToken = new StringTokenizer(data,",");
            
                stringToken.nextToken();
                System.out.printf("| %2d ",nomorData);
                System.out.printf("|\t%4s  ",stringToken.nextToken());
                System.out.printf("|\t%-20s   ",stringToken.nextToken());
                System.out.printf("|\t%-20s   ",stringToken.nextToken());
                System.out.printf("|\t%s   ",stringToken.nextToken());
                System.out.print("\n");
            }
                       
            data = bufferInput.readLine();
        }
        
        System.out.println("---------------------------------------------------------------------------------------------");
    
    }

    private static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.out.println("Database tidak ditemukan");
            System.out.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("---------------------------------------------------------------------------------------------");
        
        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data !=null) {       
            nomorData++;
            
            StringTokenizer stringToken = new StringTokenizer(data,",");
            
            stringToken.nextToken();
            System.out.printf("| %2d ",nomorData);
            System.out.printf("|\t%4s  ",stringToken.nextToken());
            System.out.printf("|\t%-20s   ",stringToken.nextToken());
            System.out.printf("|\t%-20s   ",stringToken.nextToken());
            System.out.printf("|\t%s   ",stringToken.nextToken());
            System.out.print("\n");
            
            data = bufferInput.readLine();
        }
        
        System.out.println("---------------------------------------------------------------------------------------------");
               
        
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
