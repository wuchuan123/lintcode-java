package com.github.wuchuan123;

import java.util.Map;

public class 一个普通的商品类 {
  Map<String, Integer> storage;
  Map<String, Integer> sale;

  // write your code here

  public 一个普通的商品类(Map<String, Integer> storage, Map<String, Integer> sale) {
    this.storage = storage;
    this.sale = sale;
  }

  //onSale(key, n)：将仓库中的 key 商品上架 n 个，成为在售商品，返回本次是否有货物被上架，有则为 true
  public boolean onSale(String key, int n) {
//    containsKey  返回 map中是不是有这个key
    if (!this.storage.containsKey(key) || this.storage.get(key) == 0 || n <= 0) {
      return false;
    }
    if (storage.get(key) >= n) {
      if (sale.containsKey(key)) {
        sale.put(key, n + sale.get(key));
      } else {
        sale.put(key, n);
      }
      storage.put(key,storage.get(key)-n);
    } else {
      if (sale.containsKey(key)) {
        sale.put(key, sale.get(key) + storage.get(key));
      } else {
        sale.put(key, storage.get(key));
      }
      storage.remove(key);
    }
    return true;
  }

  public int sellOut(String key, int n) {
    if (!storage.containsKey(key) || storage.get(key) == 0 || n <= 0) {
      return 0;
    }
    if (storage.get(key) > n) {
      storage.put(key, storage.get(key) - n);
      return n;
    } else {
      storage.remove(key);
      return storage.get(key);
    }
  }

  public String readStorage() {
    return this.storage.toString();
  }

  public String readSale() {
    return this.sale.toString();
  }
}
