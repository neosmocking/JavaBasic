package com.tutorial;

public class App {
    public static void main(String[] args) {
        
        int hasilInteger;
        float hasilFloat;

        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);
        
        hasilFloat = tambah(4.5f,5);
        printAngka(hasilFloat);
        
        hasilFloat = tambah(4,4.7f);
        printAngka(hasilFloat);

        hasilInteger = tambah(5,5, 5);
        printAngka(hasilInteger);
        
        printAngka(10);
        printAngka(10.5f);
        printAngka(11.6d);
        printAngka(30);
        
    }
    
    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float tambah(int angkaInt1, float angkaFloat2){
        return angkaInt1 + angkaFloat2;
    }

    private static float tambah(float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }

    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    
    private static void printAngka(double angkaDouble){
        System.out.println("angka ini adalah double dengan nilai = " + angkaDouble);
    }

    private static void printAngka(float angkaFloat){
        System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
    }

    private static void printAngka (int angkaInteger){
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);
    }
}
