package com.fuadrafid.corejavaapis.arrays;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        //For binary search, you must sort the array.
        //Binary search returns the index of the element if found
        //if not found, returns -(expected index + 1)
        //unpredictable result for unsorted array

        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1, 1 should have been at index 0 , so -(0+1) = -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2, 3 should have been at index 1 , so -(1+1) = -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5, 9 should have been at index 4 , so -(4+1) = 5

        //unpredictable behavior
        int[] numbersUnsorted = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbersUnsorted, 2));
        System.out.println(Arrays.binarySearch(numbersUnsorted, 3));
    }
}
