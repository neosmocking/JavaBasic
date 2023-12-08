package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {

        // Operator logika  --> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi

        boolean a,b,c;

        // OR / atau (||)

        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        // AND / dan (&&)

        System.out.println("==== AND (&&) ====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR / exclusive or (^)

        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT / negasi --> fliping (!)

        System.out.println("==== NEGASI (!) ====");
        a = false;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
        
        a = true;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
       
    }
}
