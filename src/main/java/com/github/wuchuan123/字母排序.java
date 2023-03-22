package com.github.wuchuan123;

// Arrays 专门用来操作数组的一些方法
import java.util.Arrays;
import java.util.List;

public class 字母排序 {
    public List<String> sort(String letter) {
        String[] strings = letter.split("");
//        CASE_INSENSITIVE_ORDER 是一个Comparator，比较字符串时直接用
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        return Arrays.asList(strings);
    }
}
