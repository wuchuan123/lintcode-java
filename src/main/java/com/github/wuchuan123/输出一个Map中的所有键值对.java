package com.github.wuchuan123;

import java.util.HashMap;
import java.util.Map;

/**
 Tom 8
 Jane 49
 Jimi 17
 Fualy 8 =>{Tom : 8, Jimi : 17, Jane : 49, Fualy : 8}
 * */
public class 输出一个Map中的所有键值对 {
    public static void main(String[] args) {
        输出一个Map中的所有键值对 输出一个Map中的所有键值对 = new 输出一个Map中的所有键值对();
        Map<String,String> hashMap=new HashMap<String,String>(){{
            put("Tom","8");
            put("Jane","49");
            put("Jimi","17");
            put("Fualy","8");
        }};
        输出一个Map中的所有键值对.printMap(hashMap);
    }
    public static void printMap(Map<String, String> map) {

    }
}
