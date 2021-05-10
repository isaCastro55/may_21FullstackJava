package com.ss.jb.day1;

import java.util.Scanner;


public class Assignment2 {

    /*
        Guess random number between 1-100
     */
    public static void main(String[]args){
        int x= (int) (Math.random() *99)+1;
        int attempt=2;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number between 1-100: ");

        int guess = scan.nextInt();
        while(attempt<=5){
            while(guess<1 || guess>100){
                System.out.print("Please enter a number between 1-100: ");
                guess= scan.nextInt();
            }

            if(guess>=(x-10) && guess<=(x+10)){
                System.out.println("Correct Guess: "+x);
                System.exit(0);
            }
            System.out.print("Guess again: ");
            guess = scan.nextInt();
            attempt++;


        }
        System.out.println("Sorry the correct answer is: "+x);
    }

}
