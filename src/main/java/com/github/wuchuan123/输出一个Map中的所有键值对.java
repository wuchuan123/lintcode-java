package com.github.wuchuan123;

import java.util.HashMap;
import java.util.Map;

/**
 * Tom 8
 * Jane 49
 * Jimi 17
 * Fualy 8 =>{Tom : 8, Jimi : 17, Jane : 49, Fualy : 8}
 */
public class 输出一个Map中的所有键值对 {
  public static void main(String[] args) {
    输出一个Map中的所有键值对 输出一个Map中的所有键值对 = new 输出一个Map中的所有键值对();
    Map<String, String> hashMap = new HashMap<String, String>() {{
      put("Tom", "8");
      put("Jane", "49");
      put("Jimi", "17");
      put("Fualy", "8");
    }};
    输出一个Map中的所有键值对.printMap(hashMap);
  }
//  replace与replaceAll的区别
  /**
   * 相同点：都是全部替换，即把源字符串中的某一字符或字符串全部换成指定的字符或字符串；
   *
   * 不同点：replaceAll支持正则表达式，因此会对参数进行解析（两个参数均是），如replaceAll("\\d", "*")，
   * 而replace则不会，replace("\\d","*")就是替换"\\d"的字符串，而不会解析为正则。
   * */
  public static void printMap(Map<String, String> map) {
    String mapString = map.toString().replaceAll("=",":");
      System.out.println(mapString);
  }
}
