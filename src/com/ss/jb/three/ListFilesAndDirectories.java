package com.ss.jb.three;

import java.io.File;

public class ListFilesAndDirectories {
    public static void main(String [] args){
        // gets current directory
        final String dir = System.getProperty("user.dir");

        // creates a new File using the found current directory
        File startingDir = new File(dir);

        // if the file exisits and is a directory (error checking)
        if(startingDir.exists() && startingDir.isDirectory())
        {
            File arr[] = startingDir.listFiles();
            System.out.println("Files from main directory : " + startingDir);
            // print files under starting directory
            printFiles(arr,0,0);
        }


    }

    public static void printFiles(File[] arr, int pos, int tabs){
        // if at end of files list return
        if(pos == arr.length)
            return;
        // calculate how many tabs necessary based on how nested files/directories go
        for(int i=0;i<tabs;i++){
            System.out.print("\t");
        }
        //if next File is a file and not a directory then only print File name
        if(arr[pos].isFile()){
            System.out.println(arr[pos].getName());
        }
        // otherwise if its directory, print directory name and recursively call printFiles() passing the found directory
        else if(arr[pos].isDirectory()){
            System.out.println("Directory: ["+arr[pos].getName()+"]");
            printFiles(arr[pos].listFiles(), 0, tabs+1);
        }
        // increase index position
        pos++;
        // continue printing files from previous directory
        printFiles(arr, pos, tabs);
    }


}
