package com.Rangan;

import java.util.*;

public class Infinite_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,8,12,16,19,25,30,33,37};
        //let's say it's an infinite array & we don't know it's size,the infinite array program starts here
        System.out.println("Enter the value to be searched");
        int s=0,e=1,v,i=0;
        v= sc.nextInt();
        if(arr[i]<=v){
            i=Search(arr,s,e,v);
            while(i==-1){
                s=e+1;
                e*=2;
                i=Search(arr,s,e,v);
            }
            if(i==0){
                System.out.println("Value not found");
            }
            else {
                System.out.println(v+" is present in index no. "+i);
            }
        }else {
            System.out.println("Value not found");
        }

    }
    static  int Search(int[] arr,int s,int e,int v){
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]>v){
                e=mid-1;
            }else if(arr[mid]<v){
                s=mid+1;
            }
            else {
                return mid;
            }
        }
        if(arr[e+1]<v){
            return -1;
        }
        else {
            return 0;
        }
    }
}
