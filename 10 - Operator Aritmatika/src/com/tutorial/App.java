package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Operasi aritmatika

        int variabel1 = 11;
        int variabel2 = 5;

        int hasil;

        // 1. Penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        // 2. Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);
        
        // 3. Perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n",variabel1,variabel2,hasil);
        
        // 4. Pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);
        
        float a = 6;
        float b = 5;
        float  hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);
        
        // 5. Modulus (sisa pembagian)
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);
     

    }
}
