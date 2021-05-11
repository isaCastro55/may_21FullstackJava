package com.ss.jb.day2;

public class Assignment4 {
    public static void main(String [] args){
        int[][] arr = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j]= (int) (Math.random() *999)+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        try{
            int[] m = findMax(arr);
            System.out.println("Max: "+m[0]+"\nRow: "+(m[1]+1)+" Col: "+(m[2]+1));

        }
        catch(Exception e){
            System.out.println("Error occurred when attempting to find max");
        }

    }
    public static int[] findMax(int[][] a){
        int[] max= new int[3];
        max[0] =a[0][0];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(a[i][j] >max[0]){
                    max[0] = a[i][j];
                    max[1] = i;
                    max[2]=j;
                }
            }
        }
        //System.out.println(max);
        return max;

    }


}
