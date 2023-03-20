package com.github.wuchuan123;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
/**你的代码需要从标准输入流（控制台）中读取一段字符串，利用 LinkedList 中的方法将该字符串反转输出在标准输出流（控制台）中。
 * */
public class LinkedList实现字符串反转输出 {
  public static void main(String[] args) {
    // 获取用户输入的类
    Scanner sc = new Scanner(System.in);
    // 读取一行数据 (时机：用户回车后读取)
    String str = sc.next();
    LinkedList<Character> list = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
//      str.charAt(i) 获取字符
      list.add(str.charAt(i));
    }
    System.out.println(list);
//    反转list
    Collections.reverse(list);
    for (char c : list) {
      System.out.print(c);
    }
  }
}
