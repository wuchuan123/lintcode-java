package com.github.wuchuan123;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个 int 数组，判断数组中是否存在重复的数字。
 * 如果存在一数字在数组中出现至少两次，则函数返回 true
 * 如果数组中每个元素都不相同，则返回 false
 * [8, 7, 1, 2, 8] => true
 */
public class 存在重复数字的数组 {
  public boolean containsDuplicate(int[] nums) {
    int length = nums.length;
//    使用HashSet 去重，在比较长度
    Set<Integer> set = new HashSet<>();
    for (int i : nums) {
      set.add(i);
    }
    return set.size() != length;
  }
}
