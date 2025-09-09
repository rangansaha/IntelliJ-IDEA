package com.Rangan;

import java.util.Scanner;

public class Fibonaci_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the position starting from 0:");
        int n= sc.nextInt();
        System.out.println(fibonaci(n));
    }
    static int fibonaci(int n){
        if(n<2){
            return n;
        }else {
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
}