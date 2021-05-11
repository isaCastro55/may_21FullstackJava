package com.ss.jb.day2;

public class Assignment4 {
    public static void main(String [] args){
        int[][] arr = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j]= (int) (Math.random() *999)+1;
            }
        }

        int max=arr[0][0];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(arr[i][j] >max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
