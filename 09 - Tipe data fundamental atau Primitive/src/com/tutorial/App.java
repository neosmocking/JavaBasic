package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {

        // tipe data di java:
        // integer, byte, short, long, double, float, char, bolean

        // integer (satuan)
        int i = 10;
        System.out.println("=======INTEGER======");
        System.out.println("Nilai integer i = " + (i+1));
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai max = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + "bytes");
        System.out.println("Besar integer = " + Integer.SIZE + "bit");

        // byte (satuan)
        byte b = 10;
        System.out.println("=======BYTE======");
        System.out.println("Nilai byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai max = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + "bytes");
        System.out.println("Besar byte = " + Byte.SIZE + "bit");

        // short (satuan)
        short s = 10;
        System.out.println("=======SHORT======");
        System.out.println("Nilai Short s = " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai max = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + "bytes");
        System.out.println("Besar Short = " + Short.SIZE + "bit");

        //long (satuan)
        long l = 10L;
        System.out.println("=======LONG======");
        System.out.println("Nilai Long l = " + l);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai max = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + "bytes");
        System.out.println("Besar Long = " + Long.SIZE + "bit");

        //double (koma, bilangan real)
        double d = -10.5d;
        System.out.println("=======DOUBLE======");
        System.out.println("Nilai Double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai max = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + "bytes");
        System.out.println("Besar Double = " + Double.SIZE + "bit");

        //float (koma, bilangan real)
        float f = -10.5f;
        System.out.println("=======FLOAT======");
        System.out.println("Nilai Float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai max = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + "bytes");
        System.out.println("Besar Float = " + Float.SIZE + "bit");
        
        //char (karakter) berdasarkan ASCII
        char c = 'c';
        System.out.println("=======CHAR======");
        System.out.println("Nilai Char c = " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai max = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + "bytes");
        System.out.println("Besar Char = " + Character.SIZE + "bit");
        
        //Boolean (nilai true atau false)
        boolean val = true;
        System.out.println("=======BOOLEAN======");
        System.out.println("Nilai Boolean val = " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai max = " + Boolean.FALSE);
           

    }
}
