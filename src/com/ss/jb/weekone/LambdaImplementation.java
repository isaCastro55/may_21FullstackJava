package com.ss.jb.weekone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaImplementation {

    public Operation odd(){
        Operation od = (i) ->{
            // if number is divisible by two return even other wise return odd
            if(i%2==0){
                return "EVEN";
            }
            return "ODD";
        };
        return od;
    }
    public Operation prime(){
        Operation prim  = (i) ->{

            // check to see if number is 0 or 1 since they are neither composite or prime
            if(i==1 || i==0){
                return "NEITHER PRIME NOR COMPOSITE";
            }
            // check to see if number is divisible by any number besides 1 and itself
            Integer count =0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }

            // if it is divisible by more numbers return composite otherwise return prime
            if(count>0){
                return "COMPOSITE";
            }
            return "PRIME";
        };
        return prim;
    }
    public Operation pal(){
        // turn number into string, reverse string and compare both strings
        Operation palin = (i) ->{
            StringBuilder x= new StringBuilder(""+i);
            if(x.toString().equals(x.reverse().toString())){
                return "PALINDROME";
            }
            return "NOT PALINDROME";
        };
        return palin;
    }

    // call op method based on p
    public static String checkOp(Operation p, Integer x){
        return p.op(x);
    }

    public StringBuilder result(String x){

        // Format input correctly
        String[] y= x.split("\n");
        List<Integer> nums= new ArrayList<Integer>();
        StringBuilder out = new StringBuilder();
        nums.add(Integer.parseInt(y[0]));
        for(int i=1;i<=nums.get(0);i++){
            String[] n= y[i].split(" ");
            nums.add(Integer.parseInt(n[0]));
            nums.add(Integer.parseInt(n[1]));
        }


        for(int i=1;i<nums.size();i+=2){
            // get operation type
            Integer typeCheck = nums.get(i);
            //get number being operated on
            Integer check = nums.get(i+1);
            Operation oper;

            // return correct operation instance
            if(typeCheck==1){
                 oper = odd();
            }
            else if(typeCheck == 2){
                 oper = prime();
            }
            else {
                 oper = pal();
            }

            // add result of operation to string
            if(i== nums.size()-2){
                out.append(checkOp(oper,check));
            }
            else{
                out.append(checkOp(oper,check)+"\n");
            }
        }
        return out;
    }



}
