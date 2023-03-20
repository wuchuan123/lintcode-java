package com.github.wuchuan123;

/**
 * 我们编写了一个泛型类 Containers 用来存储数据：
 * <p>
 * 名称	介绍
 * Containers.T	保存数据的位置
 * Containers.set(T t)	将传入的数据保存下来
 * Containers.get()	获取保存的数据
 * 请在 Solution 类中的 initContainers() 方法中编写您的代码，将传入的数据保存到 Containers 中，并将其返回。
 */
public class 泛型的使用<T> {
    public Containers<T> initContainers(T t) {
        Containers<T> containers = new Containers();
        containers.set(t);
        containers.get();
        return containers;
    }
}
