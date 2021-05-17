package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TextCount {
    public static void main(String [] args){
        // take in text from command line
        StringBuilder str= new StringBuilder();
        if(args.length>1){
            for(String x: args){
                str.append(x+" ");
            }
        }
        else{
            str.append(args[0]);
        }
        // call count text method
        System.out.println("Number of times \""+str.toString()+"\" appears in File: "+count(str.toString().toLowerCase()));
    }

    public static int count(String x){
        // number of times text appears in file
        Integer count =0;
        // buffered reader in try so dont have to close it
        // read from file called input.txt
        try (BufferedReader buf = new BufferedReader(new FileReader("resources/input/input.txt"))) {
            String line = buf.readLine();
            // read each line till end of file
            while (line != null) {
                // convert lowercase to ensure correct match
                line=line.toLowerCase();
                // while line contains phrase/text increment count and remove text from line and keep checking
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
