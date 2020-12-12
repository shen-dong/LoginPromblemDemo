package com.shendong.somesimpleloginpro.baseutil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongantong@vova.com.hk
 * @date 2020/12/12 15:49
 * @Description base login
 */
public class BaseLogin {
    public static void main(String[] args) {
        int[] arr = {5, 1, -2, 8, 3, 9, 2, 0};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int left = begin;
        int right = end;
        int temp = arr[begin];
        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            while (left < right && arr[left] <= temp) {
                left++;
            }
            if (left < right) {
                arr[left] = arr[left] ^ arr[right];
                arr[right] = arr[left] ^ arr[right];
                arr[left] = arr[left] ^ arr[right];
            }
        }
        arr[begin] = arr[left];
        arr[left] = temp;
        quickSort(arr, begin, left - 1);
        quickSort(arr, left + 1, end);
    }
}
