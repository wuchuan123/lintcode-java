package com.github.wuchuan123;

public class Containers<T> {

    private T t;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }
}