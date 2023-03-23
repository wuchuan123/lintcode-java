package com.github.wuchuan123;

import java.util.ArrayList;
import java.util.List;

public class 班级的花名册 {
    public List<String> sortName(List<String> list) {
//        list.sort 传入一个实现了比较器的类
        list.sort(String::compareTo);
        return list;
    }
}
