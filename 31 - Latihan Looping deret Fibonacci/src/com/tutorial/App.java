package com.tutorial;

import java.util.*;

public class App {
    
    public static void main (String[] Args){
        
        // menghitung nilai deret fibonaci ke-n
        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonaci ke - :");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++){
            System.out.println("nilai ke - " + i + " adalah "+ f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }






    }

}
