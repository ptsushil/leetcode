package com.biglots.com.leetcode.model;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index= search(arr,target);
        System.out.println( " Index found " + index);
    }
    public static int search(int[] arr, int target) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left =0;
        int right = arr.length -1;
       // int mid = left + (right - left)/2;  // To prevent overflowØ
        while(left <= right)
        {
            int    mid = left + (right - left)/2;  // To prevent overflow
            if (arr[mid] == target)
            {
                return mid;
            }
            if (target < arr[mid])
            {
                right = mid -1;
            }else {
                left = mid+1;
            }
        }
        return -1;  // not found
    }
}
