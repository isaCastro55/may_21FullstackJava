package com.ss.jb.day1;

public class Assignment1 {

/*
    Java patterns
 */
    public static void main(String [] args){
        //#1
        System.out.println("1)");
        for (int i =1;i<=5;i++){
            if(i==5){
                System.out.print(".........");
            }
            else{
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        //#2
        System.out.println("2)");
        for (int i =5;i>0;i--){
            if(i==5){
                System.out.print(".........");
            }
            else{
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //#3
        System.out.println("3)");
        int space = 5;
        char a = '*';
        for(int i =1;i<10;i=i+2){
            if(i==9){
                a='.';
                i=12;
            }
            if(space==1){
                space--;
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space--;
            for(int k=0;k<i;k++){

                System.out.print(a);
            }
            System.out.println();
        }


        // #4
        System.out.println("4)");
        space=2;
        for(int i =9;i>0;i=i-2){
            if(i==9){
                System.out.print("............");

            }
            else {

                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                space++;
                for (int k = 0; k < i; k++) {

                    System.out.print('*');
                }
                }
            if(i!=1){
                System.out.println();

            }

        }


    }
}
