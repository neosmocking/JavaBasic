package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        // operator komparasi... ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;
        
        // operator equal atau persamaan
        System.out.println("-----PERSAMAAN");
        a = 11;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a,b, hasilKomparasi);
                
        a = 11;
        b = 11;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a,b, hasilKomparasi);
        
        // operator not equal atau pertidaksamaan
        System.out.println("-----PERTIDAKSAMAAN");
        a = 11;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a,b, hasilKomparasi);
                
        a = 11;
        b = 11;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a,b, hasilKomparasi);
        
        // operator less atau kurang dari
        System.out.println("-----KURANG DARI");
        a = 6;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a,b, hasilKomparasi);
                
        a = 10;
        b = 8;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a,b, hasilKomparasi);

        // operator greater atau lebih dari
        System.out.println("-----LEBIH DARI");
        a = 10;
        b = 11;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a,b, hasilKomparasi);
                
        a = 12;
        b = 9;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a,b, hasilKomparasi);
        
        // operator less than equal atau kurang dari sama dengan
        System.out.println("-----KURANG DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b, hasilKomparasi);
        
        a = 4;
        b = 6;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b, hasilKomparasi);

        a = 10;
        b = 8;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b, hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("-----LEBIH DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b, hasilKomparasi);
        
        a = 7;
        b = 6;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b, hasilKomparasi);
        
        a = 4;
        b = 9;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b, hasilKomparasi);

    }
}
