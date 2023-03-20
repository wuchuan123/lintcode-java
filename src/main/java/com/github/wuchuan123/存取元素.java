package com.github.wuchuan123;

import java.util.ArrayList;
import java.util.List;
// 1 8 23 78 21 09 90 76 54 78=>
/**After adding the element:
 [1, 8, 23, 78, 21, 9, 90, 76, 54, 78]
 Get the element:
 78
 After getting the element:
 [1, 8, 23, 78, 21, 9, 90, 76, 54]
 * */
public class 存取元素 {
    private List<Integer> list = new ArrayList<>();

    public void add(int num) {
        list.add(num);
    }

    public void show() {
        System.out.println(list);
    }

    public int remove() {
        return list.remove(list.size() - 1);
    }
}
