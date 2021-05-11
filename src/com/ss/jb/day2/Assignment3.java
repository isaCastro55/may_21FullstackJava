package com.ss.jb.day2;

public class Assignment3 {
    public static void main(String [] args){
        double sum =0;
        for(String x: args){
            double dnum = Double.parseDouble(x);
            sum+=dnum;
        }
        System.out.println(sum);
    }
}
