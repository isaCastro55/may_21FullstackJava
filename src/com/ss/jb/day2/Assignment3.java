package com.ss.jb.day2;

public class Assignment3 {
    public static void main(String [] args){
        Double sum =0.0;

        for(String x: args){
            try{
                Double dnum = Double.parseDouble(x);
                sum+=dnum;
            }
            catch(Exception e){
                System.out.println("Non Numeric values will not be added");
            }

        }
        System.out.println("Sum of Numeric Values: "+sum);
    }
}
