package com.ss.jb.three;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Scanner;

public class AppendText {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Text to append to file: ");
        appendToFile();

    }

    // appends to file until ctrl D pressed
    public static void appendToFile() {
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))) {
            String x=buf.readLine();
            while(x != null){
                x="\n"+x;
                byte[] read = x.getBytes();
                Files.write(Paths.get("resources/out.txt"), read, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                x=buf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
