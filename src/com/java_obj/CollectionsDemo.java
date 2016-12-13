/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.java_obj;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a on 2016/12/13.
 */
public class CollectionsDemo {
  public static void main(String[] args) {
    Map m1 = new HashMap();
    m1.put("Zara", "8");
    m1.put("Mahnaz", "31");
    m1.put("Ayan", "12");
    m1.put("Daisy", "14");
    System.out.println();
    System.out.println(" Map Elements");
    System.out.print("\t" + m1);
    System.out.print(m1.size());
    System.out.println();

    System.out.println(m1.toString());
    System.out.println(m1.get("Zara"));
    System.out.println(m1.isEmpty());
    System.out.println(m1.remove("Ayan"));
    System.out.println(m1.toString());
    System.out.println(m1.containsKey("jack"));
    System.out.println(m1.containsValue("31"));
    System.out.println(m1.hashCode());
    System.out.println(m1.keySet());
    System.out.println(m1.values());

    m1.clear();
    System.out.println(m1);

  }
}
