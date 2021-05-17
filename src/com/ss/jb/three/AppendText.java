package com.ss.jb.three;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AppendText {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Text to append to file: ");
        appendToFile();

    }

    // appends to file until program is ended
    public static void appendToFile() {
        // put inside try so dont have to close buffered reader
        // buffered reader reads from console until user ends program
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))) {
            String x=buf.readLine();
            while(x != null){
                x="\n"+x;
                byte[] read = x.getBytes();
                // writes text to file using APPEND option (so text is appended)
                // and CREATE option to ensure file is created if not already
                Files.write(Paths.get("resources/out.txt"), read, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                x=buf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
