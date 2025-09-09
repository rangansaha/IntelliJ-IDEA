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
    static void search(int[][] matrix, int target){
        int d=0;
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                System.out.println(target+" isn't present in the matrix");
                return;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;
            int r = 0;
            int c = cols - 1;

            while (r < rows && c >= 0) {
                if (matrix[r][c] == target) {
                    System.out.println(target+" is present in the matrix at row index no. "+r+" & column index no. "+c);
                    return;
                } else if (matrix[r][c] < target) {
                    r++;
                } else {
                    c--;
                }
            }

           System.out.println(target+" isn't present in the matrix");
    }
}
