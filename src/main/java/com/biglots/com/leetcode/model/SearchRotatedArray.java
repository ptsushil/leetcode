package com.biglots.com.leetcode.model;

public class SearchRotatedArray {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (arr[left] <= arr[mid]) { // Left half is sorted
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1; // Search in left half
                } else {
                    left = mid + 1; // Search in right half
                }
            } else { // Right half is sorted
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1; // Search in right half
                } else {
                    right = mid - 1; // Search in left half
                }
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {17, 19, 25, 27, 3, 5, 10, 14,33, 35, 37, 40};
        int target = 35;
        int index = searchIndex(arr, target);
        System.out.println("Element " + target + " found at index: " + index);
    }

    private static int searchIndex(int[] arr, int target) {

        int left =0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // determine which half is sorted
            if(arr[left] < arr[mid]) {
                if(arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else
            {
                if(arr[mid] < target && target <= arr[right]) {
                    left = mid +1;
                }else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}

