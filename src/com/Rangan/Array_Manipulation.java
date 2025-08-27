package com.Rangan;

import java.util.*;

public class Array_Manipulation {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n,go=1,o;
        System.out.print("Enter size of the array:");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter values of the array:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        do {
            System.out.println("Enter any of the following:\n1)Swap\t2)Display\t3)Insert\t4)Searching\t5)Sorting\t0)Exit");
            o = sc.nextInt();
            switch (o) {
                case 1:
                    swap(arr);
                    break;
                case 2:
                    display(arr);
                    break;
                case 3:
                    System.out.print("Enter the value you want to enter:");
                    int v=sc.nextInt();
                    insert(arr,v);
                    break;
                case 4:
                    int s=0,search=-1,e=arr.size()-1;
                    System.out.print("Enter the value to be searched:");
                    int value= sc.nextInt();
                    System.out.println("Enter 1  to Custom Range,anything else for default");
                    int r= sc.nextInt();
                    if(r==1){
                        System.out.print("Enter starting index:");
                        s= sc.nextInt();
                        System.out.print("Enter ending index:");
                        e=sc.nextInt();
                    }
                    System.out.println("Enter the method of Searching:\n1)Linear Search\t2)Binary Search");
                    o=sc.nextInt();
                    switch (o){
                        case 1:
                            search= linearSearch(arr,value,s,e);
                            break;
                        case 2:
                            bubbleSort(arr);
                            search= BinarySearch(arr,value,s,e);
                            break;
                        default:
                            bubbleSort(arr);
                            search= BinarySearch(arr,value,s,e);
                            break;
                    }
                    if(search!=-1){
                        System.out.println(value+" found at index no:"+search);
                    }
                    else{
                        System.out.println(value+" not found,press 1 if you want to insert it:");
                        o=sc.nextInt();
                        if(o==1){
                            insert(arr,value);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter the method of Searching:\n1)Bubble Sort\t2)Selection Sort\t3)Insertion Sort");
                    o=sc.nextInt();
                    switch (o){
                        case 1:
                            bubbleSort(arr);
                            break;
                        case 2:
                            selectionSort(arr);
                            break;
                        case 3:
                            insertionSort(arr);
                            break;
                    }
                    break;
                case 0:
                    go=0;
                    break;
                default:
                    System.out.println(arr);
                    System.out.println("Invalid choice");
                    break;
            }
        }while(go==1);
    }
    static void swap(ArrayList<Integer> arr){
        int f=0,r=arr.size()-1;
        while(f<r){
            int temp = arr.get(f);
            arr.set(f, arr.get(r));
            arr.set(r, temp);
            f++;
            r--;
        }
        display(arr);
    }
    static void  display(ArrayList<Integer> arr){
        System.out.println(arr);
    }
    static void insert(ArrayList<Integer> arr,int v){
        int i;
        System.out.println("Enter 1 to custom index,anything else for default");
        i=sc.nextInt();
        if (i==1){
            System.out.println("Enter index within 0 to "+arr.size());
            i= sc.nextInt();
            arr.add(i,v);
        }
        else {
            arr.add(v);
        }
    }
    static int linearSearch(ArrayList<Integer> arr, int value, int s, int l){
        for (int i = s; i <=l ; i++){
            if(arr.get(i)==value){
                return i;
            }
        }
        return -1;
    }
    static int BinarySearch(ArrayList<Integer> arr, int value, int s, int e){
        int mid=(s+e)/2;
        if (s>e){
            return -1;
        }
        else{
            if (arr.get(mid)>value){
                return BinarySearch(arr,value,s,mid-1);
            } else if (arr.get(mid)<value) {
                return BinarySearch(arr,value,mid+1,e);
            }
            else {
                return mid;
            }
        }
    }
    static  void bubbleSort(ArrayList<Integer> arr){
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = 0; j <arr.size()-i-1 ; j++) {
                if (arr.get(j)> arr.get(j+1)){
                    int temp=arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1,temp );
                }

            }
        }
        display(arr);
    }
    static void selectionSort(ArrayList<Integer> arr){
        int min=0,index=0,i,j;
        for (i = 0; i <arr.size() ; i++) {
            min= arr.get(i);
            index=i;
            for (j=i+1;j<arr.size();j++){
                if(arr.get(j)<min){
                    index=j;
                }
            }
            int temp=arr.get(i);
            arr.set(i, arr.get(index));
            arr.set(index,temp );
        }
        display(arr);
    }
    static void insertionSort(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr.get(j)<arr.get(j-1)) {
                    int t= arr.get(j);
                    arr.set(j,arr.get(j-1));
                    arr.set(j-1,t);
                }else {
                    break;
                }
            }
        }
        display(arr);
    }
}
