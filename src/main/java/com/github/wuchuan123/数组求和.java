package com.github.wuchuan123;

import java.util.Arrays;

public class 数组求和 {
    public int getSum(int arr[]) {
//        distinct() 去重   sum() 求和
       return Arrays.stream(arr).distinct().sum();
    }
}
