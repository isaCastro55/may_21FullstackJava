package com.ss.jb.five;

import jdk.jfr.internal.Utils;

import java.util.*;

public class BasicLambdas {
//    public static void main(String[]args){
//
//        String[] test = {"not","Hello","effect","empty","room","want"};
//
//        test =eFirst(test);
//
//        for(String x: test){
//            System.out.println(x);
//        }
//    }

    public String[] shortestToLongest(String[] a){
        Arrays.sort(a, new ShortestToLongestComp());
        return a;
    }
    public String[] longestToShortest(String[] a){
        Arrays.sort(a, new LongestToShortestComp());
        return a;
    }
    public String[] alphabetical(String[] a){
        Arrays.sort(a, new alphabeticalComp());
        return a;
    }
    public String[] eFirst(String[] a){
        Arrays.sort(a, (o1,o2)->{
            if((o1.contains("e")&& !o2.contains("e")) || (o1.contains("E")&& !o2.contains("E"))){
                return -1;
            }
            if((!o1.contains("e")&& o2.contains("e")) || !o1.contains("E")&& o2.contains("E")){
                return 1;
            }
            return 0;
        });
        return a;
    }
    public String[] eFirstTwo(String[] a){
        Arrays.sort(a, (o1,o2)-> helper(o1,o2));
        return a;
    }
    public static Integer helper(String a, String b){
        if((a.contains("e")&& !b.contains("e")) || (a.contains("E")&& !b.contains("E"))){
            return -1;
        }
        if((!a.contains("e")&& b.contains("e")) || !a.contains("E")&& b.contains("E")){
            return 1;
        }
        return 0;

    }
}
