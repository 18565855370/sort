package com.slxsm.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void sort(int[] array, int low, int high) {
        if (array == null || array.length <= 0){
            return;
        }
        if (low >= high){
            return;
        }
        int left = low;
        int right = high;
        int key = array[left];
        while (left < right){
            while (left < right && array[right] >= key){
                right--;
            }
            while (left < right && array[left] <= key){
                left++;
            }
            if (left < right){
                swap(array,left,right);
            }
        }
        swap(array,low,right);
        System.out.println("Sorting: " + Arrays.toString(array));
        sort(array,low,left - 1);
        sort(array,left + 1, high);
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
