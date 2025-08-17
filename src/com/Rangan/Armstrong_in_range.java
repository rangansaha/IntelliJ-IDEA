package com.Rangan;
import java.util.*;
public class Armstrong_in_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range:");
        int a,b,s,c=0;
        a= sc.nextInt();
        System.out.print("Enter the ending range:");
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            String str=String.valueOf(i);
            int n=str.length();
            s=Armstrong(i,n);
            if(i==s){
                System.out.println(i+" is a armstrong number");
                c++;
            }
        }
        if(c==0){
            System.out.println("There is no armstrong number between "+a+" & "+b);
        }
    }
    static int Armstrong(int k,int n){
        double r;
        int sum=0;
        while(k!=0){
            r=k%10;
            sum=sum+(int)Math.pow(r,n);
            k=k/10;
        }
        return sum;
    }
}
