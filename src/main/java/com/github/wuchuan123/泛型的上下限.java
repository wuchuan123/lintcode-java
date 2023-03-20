package com.github.wuchuan123;

/**
 * 接收一个 Info，只能接收 Number 及其 Number 的子类，并获取 Info 中的值返回
 * 接收一个 Info，只能接收 String 或 Object 类型的泛型，并获取 Info 中的值返回
 * 请您在 Solution 类中实现方法 upperLimit() 和 lowerLimit() 的功能。
 */
public class 泛型的上下限 {
    // <? extends Number> 任何声明为Number的子类型是合法的
    public Number upperLimit(Info<? extends Number> info) {
        return info.get();
    }
    // <? super String> 任何声明为String的超类型是合法的
    public Object lowerLimit(Info<? super String> info) {
        return info.get();
    }
}
