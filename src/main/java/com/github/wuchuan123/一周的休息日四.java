package com.github.wuchuan123;

import java.util.EnumMap;
import java.util.List;

public class 一周的休息日四 {
    public static EnumMap<WeekDay, Integer> getRestDays(List<WeekDay> list) {
        EnumMap<WeekDay, Integer> result = new EnumMap<WeekDay, Integer>(WeekDay.class);
        int sat = (int) list.stream().filter(WeekDay.SAT::equals).count();
        int sun = (int) list.stream().filter(WeekDay.SUN::equals).count();
        if (sat > 0) {
            result.put(WeekDay.SAT, sat);
        }
        if (sun > 0) {
            result.put(WeekDay.SUN, sat);
        }
        return result;
    }
}
