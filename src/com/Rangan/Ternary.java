package com.Rangan;
import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d=sc.nextInt();
        int max=(a>b)?a:(b>c && b>d)?b:(c>d)?c:d;
        System.out.println(max);
    }
}