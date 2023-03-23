package com.github.wuchuan123;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 数组合并 {
  public int[] mergeArray(int arr1[], int arr2[]) {
//    int[] list = new int[arr1.length + arr2.length];
//    System.arraycopy 合并数组 参数：1、源数组 2、源数组起始位置 3、目标数组 4、并入目标数组起始位置 5、并入目标数组的数量
//    因为是基本数据类型的数组，不好直接使用Stream.concat进行合并。基本类型的数组要用专用流。集合会自动装箱所以没这个问题
//   可以参考的文章 JDK8使用Stream对数组合并、去重 https://www.geek-share.com/detail/2718877489.html
//    System.arraycopy(arr1, 0, list, 0, arr1.length);
//    System.arraycopy(arr2, 0, list, arr1.length, arr2.length);
//    return Arrays.stream(list).distinct().sorted().toArray();
    // 方法二使用IntStream 基本数据类型的流
    return IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().sorted().toArray();
  }
}
