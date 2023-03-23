package com.github.wuchuan123;

public class 期末考试的光荣榜 implements Comparable {

    private String name;
    private int score;

    public 期末考试的光荣榜(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public int compareTo(Object s) {
        // write your code here
        期末考试的光荣榜 s1 = (期末考试的光荣榜) s;
        if (s1.score == this.score) {
            return this.name.compareTo(s1.name);
        } else {
            return s1.score - this.score;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.score;
    }
}