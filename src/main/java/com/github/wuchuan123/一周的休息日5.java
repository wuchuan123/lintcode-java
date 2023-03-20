package com.github.wuchuan123;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 我们的一周 SUN, MON, TUE, WED, THU, FRI, SAT，分别代表 周日，周一，周二，周三，周四，周五，周六。
 * 我们会启动多个线程存入键值对 key = 年月日期, value= 周日期 至 Solution 类的静态变量 map
 * （请选择合适的键值对集合，补全 map 的定义代码段），其中 年月日期 包含从 "2021年10月8日" 起往后 7000 天内的所有日期，
 * 周日期 是我们上述中的对应周日期。
 * 同时，你需要在 getWeekDay() 方法中返回一个 Thread 线程数组，我们会在 Main 中启动该数组中的所有线程。
 * https://www.lintcode.com/problem/2907/description?showListFe=true&page=1&problemTypeId=6&pageSize=50
 */
public class 一周的休息日5 {
  static String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
  static Map<String, String> map = new ConcurrentHashMap<>();
  // AtomicInteger 一个可以原子更新的int值。多线程时对数字进行递增或递减时使用这个类。
  static AtomicInteger counter = new AtomicInteger(0);
  //  创建日期的方法  LocalDate.of 返回LocalDate类
  static LocalDate startDate = LocalDate.of(2021, 10, 8);

  static Thread[] getWeekDay() throws Exception {
    // 创建一个线程数组
    Thread[] weekDay = new Thread[16];
    // 为数组的每个元素赋值
    for (int i = 0; i < weekDay.length; i++) {
      weekDay[i] = new Thread(() -> {
        int next = 一周的休息日5.counter.getAndDecrement();
        while (next < 7000) {
          // 返回添加了指定天数的此LocalDate的副本。例如，2008-12-31加上一天，结果将是2009-01-01。
          // plusYears 在年上加指定年数 plusMonths在月上就指定月数
          LocalDate currDate = startDate.plusDays(next);
          // 生成key，并格式化key，使用format方法。DateTimeFormatter.ofPattern（）会返回一个DateTimeFormatter类
          String key = currDate.format(DateTimeFormatter.ofPattern("yyyy-M-d"));
          // currDate.get(ChronoField.DAY_OF_WEEK) 获取一周的第几天
          String value = day[currDate.get(ChronoField.DAY_OF_WEEK) == 7 ? 0 : currDate.get(ChronoField.DAY_OF_WEEK)];
          一周的休息日5.map.put(key, value);
          next = 一周的休息日5.counter.getAndDecrement();
        }
      });
    }

    return weekDay;
  }
}
