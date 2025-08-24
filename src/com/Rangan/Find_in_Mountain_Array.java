package com.Rangan;

import java.util.*;
//leetcode hard problem:- https://leetcode.com/problems/find-in-mountain-array/
public class Find_in_Mountain_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>mountainArr=new ArrayList<>();
        System.out.println("Enter size of mountain array:");
        int s=sc.nextInt();
        System.out.println("Enter the values of the mountain array:");
        for (int i = 0; i < s; i++) {
            mountainArr.add(sc.nextInt());
        }
        System.out.println("Enter the value to be searched:");
        int target=sc.nextInt();
        int peak = findPeakIndex(mountainArr);
        // Search in ascending part
        int i= binarySearch(mountainArr, 0, peak, target, true);
        if (i != -1) {
            System.out.println(target+" found in index no:"+i);
        }else {
            // Search in descending part
            i=binarySearch(mountainArr, peak + 1, mountainArr.size() - 1, target, false);
            if (i!=-1){
                System.out.println(target+" found in index no:"+i);
            }else {
                System.out.println(target+" is not found in the Mountain Array");
            }
        }
    }


    static int findPeakIndex(ArrayList<Integer> arr) {
        int s= 0, e= arr.size() - 1;
        while (s < e) {
            int mid = (s+ e) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                s= mid + 1;
            } else {
                e= mid;
            }
        }
        return s;
    }

    static int binarySearch(ArrayList<Integer> arr, int s, int e, int target, boolean isAsc) {
        while (s <= e) {
            int mid = (s + e) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (isAsc) {
                if (val < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (val > target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
