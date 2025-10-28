package com.Rangan;
import java.util.*;
public class Merge_Sort_using_a_new_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER ALL THE VALUES OF THE ARRAY:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int[]arr){
        if(arr.length<2){
            return arr;
        }else{
            int mid=arr.length/2;
            int[] left=merge(Arrays.copyOfRange(arr,0,mid));
            int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
            return sort(left,right);
        }
    }
    static int[] sort(int[] left,int[] right){
        int i=0,j=0,m=left.length,n=right.length,k=0;
        int[] arr=new int[m+n];
        while (i<m && j<n){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<m||j<n){
            if(i<m){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        return arr;
    }
}
