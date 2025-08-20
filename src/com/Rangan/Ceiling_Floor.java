package com.Rangan;

import java.util.*;

public class Ceiling_Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value to be searched: ");
        int v = sc.nextInt();

        int index = binarySearchCeiling(arr, v, 0, n - 1);

        if (arr[index]==v) {
            System.out.println("The ceiling as well as floor value of " + v + " is " + arr[index]);
        } else {
            // ceiling is the no. equal to the no. or smallest no. greater than the no.
            System.out.println("The ceiling value of " + v + " is " + arr[index]);
            // floor is equal to the no. or smaller greatest no.
            System.out.println("The floor value of " + v + " is " + arr[index-1]);
        }
    }

    static int binarySearchCeiling(int[] arr, int value, int s, int e) {
        if (s > e) {
            return s;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] < value) {
            return binarySearchCeiling(arr, value, mid + 1, e);
        } else {
            return binarySearchCeiling(arr, value, s, mid - 1);
        }
    }
}