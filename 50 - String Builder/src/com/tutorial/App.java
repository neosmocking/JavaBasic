package com.tutorial;

import java.lang.StringBuilder;

public class App {
    public static void main(String[] args) {
       
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // append
        
        builder.append(" semuanya");
        printData(builder);
        
        builder.append(" warga Surabaya");
        printData(builder);

        // insert

        builder.insert(19, " kota");
        System.out.println(builder);

        // delete

        builder.delete(19, 24);
        System.out.println(builder);
        
        // rubah character pada index tertentu

        builder.setCharAt(14, 'W');
        System.out.println(builder);

        // replace
        builder.replace(20, 28, "Bandung");
        printData(builder);

        // casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = "+ Integer.toString(addressString));

        


    }
    
    public static void printData(StringBuilder dataBuilder) {
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = "+ dataBuilder.capacity());
    
        int addressbuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = "+ Integer.toString(addressbuilder));
        
    }
}
