package com.slxsm.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public static int[] sort(int[] array){
        System.out.println(Arrays.toString(array));
        if (array.length <= 1){
            return array;
        }
        int num = array.length >> 1;
        int[] left = Arrays.copyOfRange(array,0,num);
        int[] right = Arrays.copyOfRange(array,num,array.length);
        return mergeTwoArray(sort(left),sort(right));
    }

    public static int[] mergeTwoArray(int[] a, int[] b){
        int i = 0,j = 0,k = 0;
        int[] result = new int[a.length + b.length];//申请额外空间保存归并之后的数据

        while (i < a.length && j < b.length){//选取两个序列中的较小值放入新数组
            if (a[i] <= b[j]){
                result[k++] = a[i++];
            }else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length){
            result[k++] = a[i++];
        }
        while (j < b.length){
            result[k++] = b[j++];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
