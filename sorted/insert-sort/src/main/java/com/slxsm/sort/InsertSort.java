package com.slxsm.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++){
            int j;
            int temp = array[i];//先取出待插入数据保存，因为向后位移过程中会把覆盖待插入数
            for (j = i - 1; j >= 0; j--){
                //将大于temp的数向后移动一步
                if (array[j] > temp){
                    array[j+1] = array[j];//记录j的值也就是temp要插入的位置
                }else {
                    break;
                }
            }
            array[j+1] = temp;//找到比待插入数据小的位置，将待插入数据插入
            System.out.println(Arrays.toString(array));
        }
    }
}
