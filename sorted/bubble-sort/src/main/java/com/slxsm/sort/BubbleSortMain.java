package com.slxsm.sort;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * 排序算法之冒泡排序main类
 */
public class BubbleSortMain {

    public static void main(String[] args) {
        int[] array = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        array = BubbleSort.sort(array);
        StringBuilder sbd = new StringBuilder();
        for (int arr : array){
            sbd.append(arr).append(",");
        }
        System.out.println(sbd.substring(sbd.length() - 1, sbd.length()));
    }
}
