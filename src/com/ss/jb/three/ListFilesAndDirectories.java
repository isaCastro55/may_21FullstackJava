package com.ss.jb.three;

import java.io.File;

public class ListFilesAndDirectories {
    public static void main(String [] args){
        final String dir = System.getProperty("user.dir");

        File startingDir = new File(dir);

        if(startingDir.exists() && startingDir.isDirectory())
        {
            File arr[] = startingDir.listFiles();
            System.out.println("Files from main directory : " + startingDir);
            printFiles(arr,0,0);
        }


    }

    public static void printFiles(File[] arr, int pos, int tabs){
        if(pos == arr.length)
            return;

        for(int i=0;i<tabs;i++){
            System.out.print("\t");
        }

        if(arr[pos].isFile()){
            System.out.println(arr[pos].getName());
        }
        else if(arr[pos].isDirectory()){
            System.out.println("Directory: ["+arr[pos].getName()+"]");
            printFiles(arr[pos].listFiles(), 0, tabs+1);
        }
        pos++;
        printFiles(arr, pos, tabs);
    }


}
