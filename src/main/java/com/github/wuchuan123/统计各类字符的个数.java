package com.github.wuchuan123;

import java.util.HashMap;
import java.util.Map;

/**
 * a1 b2 c3 d4;
 * =>Numbers=4
 * Others=1
 * Letters=4
 * Spaces=3
 */
//https://www.lintcode.com/problem/3240/?showListFe=true&page=1&problemTypeId=6&pageSize=50
public class 统计各类字符的个数 {
    public static void main(String[] args) {
        统计各类字符的个数 统计各类字符的个数 = new 统计各类字符的个数();
        统计各类字符的个数.getLettersCounts("a1 b2 c3 d4;");
    }

    public Map<String, Integer> getLettersCounts(String s) {

        int nums = 0;
        int letters = 0;
        int spaces = 0;
        int others = 0;
/**
 * Java有专门处理字符的类，Character，将字符串通过toCharArray()转成char数组，在进行统计。
 * */
        Map<String, Integer> map = new HashMap<>();
        // write your code here
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                map.put("spaces", ++spaces);
            } else if (Character.isDigit(chars[i])) {
                map.put("nums", ++nums);
            } else if (Character.isLetter(chars[i])) {
                map.put("letters", ++letters);
            } else {
                map.put("others", ++others);
            }
        }
        return map;
    }
}
