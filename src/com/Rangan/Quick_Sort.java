package com.Rangan;
import java.util.Arrays;
import java.util.Scanner;
public class Quick_Sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int s= sc.nextInt();
        int []arr=new int[s];
        System.out.println("Enter all the values of the array:");
        for (int i = 0; i <s; i++) {
            arr[i]= sc.nextInt();
        }
        quick_sort(arr,0,s-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick_sort(int[] arr,int low,int high){
        if(low<high) {
            int pivot = arr[high], j = low-1;
            for (int i = low; i < high; i++) {
                if (pivot > arr[i]) {
                    j++;
                    if (j != i) {
                        arr[i] = arr[i] + arr[j];
                        arr[j] = arr[i] - arr[j];
                        arr[i] = arr[i] - arr[j];
                    }
                }
            }
            j++;
            arr[high] = arr[high] + arr[j];
            arr[j] = arr[high] - arr[j];
            arr[high] = arr[high] - arr[j];
            quick_sort(arr, low, j - 1);
            quick_sort(arr, j + 1, high);
        }
    }
}