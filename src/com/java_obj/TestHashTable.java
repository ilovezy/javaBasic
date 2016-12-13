/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.java_obj;
import java.util.*;

public class TestHashTable {
  public static void main(String args[]) {
    // create a hash map
    Hashtable balance = new Hashtable();
    Enumeration names;
    String str;
    double bal;

    balance.put("Zara", 3434.34);
    balance.put("Milah", 24.34);
    balance.put("Jakc", 2434.34);
    balance.put("Ham", 344.34);
    balance.put("Colp", -314.34);

    // show all balances in hash table
    names = balance.keys();
    while (names.hasMoreElements()) {
      str = (String) names.nextElement();
      System.out.println(str + ": " + balance.get(str));
    }

    System.out.println();

    // deposit 1000 into zara's account
    bal = ((Double)balance.get("Zara")).doubleValue();
    balance.put("Zara", bal + 1000);
    System.out.println("Zara's new balance: " + balance.get("Zara"));
  }
}
