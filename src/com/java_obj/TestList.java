/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.java_obj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("ack");
    list.add("ahahah");

    for(String str : list) {
      System.out.println(str);
    }

    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    Iterator<String> ite = list.iterator();
    while (ite.hasNext()) {
      System.out.println(ite.next());
    }
  }
}
