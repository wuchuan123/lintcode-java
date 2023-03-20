package com.github.wuchuan123;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * 阿牛最近在学习 LinkedList 的知识，现在他想要测试一下自己究竟学会了多少，他成功的发现了自己并没有掌握相关知识点，
 * 现在需要你帮助他完成这道题目，给定六个字符串，将这些字符串存放在 LinkedList 中，
 * 然后将 LinkedList 中重复的元素删除，最后将 LinkedList 中所有元素用迭代器方式打印在标准输出流（控制台）中，
 * 请你帮助她完成这道题目
 */
public class LinkedList去除重复元素 {
  public static LinkedList<String> Weighting(LinkedList<String> list) {
//    LinkedHashSet 去重和顺序不混乱
    return new LinkedList<>(new LinkedHashSet<>(list));
  }

}
