package com.github.wuchuan123;

import java.util.Arrays;
import java.util.Comparator;

/**
 * he see a ball =>
 * a
 * he
 * see
 * ball
 */

public class 使用Lambda表达式实现字符串排序 {
    public static void main(String[] args) {
        String[] str = {"he", "see", "a", "ball"};
        使用Lambda表达式实现字符串排序 使用Lambda表达式实现字符串排序 = new 使用Lambda表达式实现字符串排序();
        使用Lambda表达式实现字符串排序.sortByLength(str);
    }

    public void sortByLength(String[] strArr) {
        /** 1、把strArr变成流
         *  2、调用stream的sorted方法，该方法接受一个实现Comparator的类，
         *  使用Comparator的静态方法comparing，会返回一个实现Comparator的类，该方法接受一个方法（这个方法是一个纯函数）
         *  3、forEach 结束这个流。 :: lambda的写法，这个对象有这个方法可以这样简写，或者这个类有这个静态方法
         *  Comparator.comparing 源码： (Comparator<T> & Serializable) 意思是类型强制转换，即可串行化比较器
         *  public static <T, U extends Comparable<? super U>> Comparator<T> ...   解释:
         *  <T, U extends Comparable<? super U>> 声明T   Comparator<T> 使用T (head first Java 543)
         * */

        Arrays.stream(strArr).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
