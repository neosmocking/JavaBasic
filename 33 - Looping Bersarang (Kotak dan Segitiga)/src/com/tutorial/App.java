package com.tutorial;


public class App {
    public static void main(String[] args) throws Exception {

        // looping bersarang

        for (int i = 0; i < 5; i++){            
            for (int j = 0; j<5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int i = 0; i < 5; i++){            
            for (int j = 0; j<5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int i = 0; i < 5; i++){            
            for (int j = 0; j<5; j++){
                System.out.print("* ");                
                if ((i+j)==4){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int i = 0; i < 9; i++){            
            for (int j = 0; j<9; j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }else if ((i+j)==8){
                    break;
                }

            }            
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for(int y = 0;y < 9; y++){
            System.out.println(" ");
            for (int x = 0; x < 9; x++){
            if ( (x - y) >= 5 ){
                break;
            }
            else if((x >= 0) && (x <= 3) && (x+y < 4)){
                System.out.print("  ");
                continue;
            }
            else if((x + y) > 12){
                break;
            }
            else if(x >= 0 && x <= 3 && y > 4 && x - y < -4){
                System.out.print("__");
                continue;
            }

            System.out.print("* ");
            }
        }



        
    }
}
