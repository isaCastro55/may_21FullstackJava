package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextCount {
    public static void main(String [] args){
        StringBuilder str= new StringBuilder();
        if(args.length>1){
            for(String x: args){
                str.append(x+" ");
            }
        }
        else{
            str.append(args[0]);
        }
        System.out.println("Number of times \""+str.toString()+"\" appears in File: "+count(str.toString().toLowerCase()));
    }

    public static int count(String x){
        Integer count =0;
        try (BufferedReader buf = new BufferedReader(new FileReader("resources/input/input.txt"))) {
            String line = buf.readLine();
            while (line != null) {
                line=line.toLowerCase();
                while(line.contains(x)){
                    Integer pos = line.indexOf(x);
                    count++;
                    line=line.substring(pos+x.length());
                }
                line = buf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
