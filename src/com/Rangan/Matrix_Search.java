package com.Rangan;

import java.util.*;

public class Matrix_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n of a n*n matrix:");
        int n= sc.nextInt();
        int[][] m=new int[n][n];
        System.out.println("Enter values in such a way that both rows & columns will be sorted:");
        for (int i = 0; i <n; i++) {
            System.out.println("Enter values of row "+(i+1));
            for (int j = 0; j <n; j++) {
                m[i][j]=sc.nextInt();
            }
        }
        int i=1;
        while(i!=0){
            System.out.println("Enter the value to be searched:");
            int v= sc.nextInt();
            search(m,v);
            System.out.println("Press 0 to exit & anything else to search again to search again");
            i= sc.nextInt();
        }
    }
    static void search(int[][] m,int v){
        int r=0,c=m.length-1,f=0;
        do {
           if(m[r][c]==v){
               System.out.println(v+" is found in row no. "+(r+1)+" & column no. "+(c+1));
               f=1;
               break;
           }else if(m[r][c]<v){
               r++;
           }else{
               c--;
           }
        }while(r!=m.length && c!=-1);
        if(f==0){
            System.out.println(v+" isn't present in the array");
        }
    }
}
