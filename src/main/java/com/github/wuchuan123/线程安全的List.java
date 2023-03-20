package com.github.wuchuan123;

import java.util.List;
import java.util.Vector;

//https://www.lintcode.com/problem/2906/description?showListFe=true&page=1&problemTypeId=6&pageSize=50
public class 线程安全的List {
    public List<Integer> getList() {
        // Vector创建的List是线程安全的
        Vector<Integer> vector = new Vector();
        return vector;
    }
}
