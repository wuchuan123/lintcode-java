package com.github.wuchuan123;

import java.util.*;

public class 删除集合中的最小值 {
  public ArrayList<Integer> sort() {
    // write your code here
    Scanner sc = new Scanner(System.in);
    // 读取一个数字 将输入的下一个标记扫描为int。
    int num = sc.nextInt();
    ArrayList<Integer> arrayList = new ArrayList<>();
    while (num != 0) {
      arrayList.add(num);
      num = sc.nextInt();
    }
    Collections.sort(arrayList);
    arrayList.remove(0);
    return arrayList;
  }
}
