package com.slxsm.sort;

/**
 * 快速排序
 * @author slxsm
 * @date 2019/7/4
 */
public class BubbleSort {

    public static int[] sort(int[] array){
        if (array == null || array.length == 0){
            return null;
        }
        int length = array.length;
        //外层，需要length - 1 次循环比较
        for (int i = 0; i < length - 1; i++){
            //内层，每次循环需要两两比较的次数，每次比较后，都会将最大的数放到最后的位置，所以每次比较次数会递减一次
            for (int j = 0; j < length - i - 1; j++){
                if (array[j] > array[j+1]){
                    //交换数组array的j和j+1位置的数据
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }

    /**
     * 交换数组array的i和j位置的数据
     * @param array 数组
     * @param i 下标i
     * @param j 小标j
     */
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
