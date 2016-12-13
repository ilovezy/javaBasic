/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.java_obj;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropDemo {
  public static void main(String args[]) {
    Properties capitals = new Properties();
    Set states;
    String str;

    capitals.put("illionois", "springfield");
    capitals.put("Missouri", "Jefferson City");
    capitals.put("Washington", "Olympia");
    capitals.put("California", "Sacramento");
    capitals.put("Indiana", "Indianapolis");

    // show all states and capitals in hashtable
    states = capitals.keySet();
    Iterator itr = states.iterator();
    while (itr.hasNext()) {
      str = (String) itr.next();
      System.out.println("The capital of " +
          str + " is " + capitals.getProperty(str) + ".");
    }

    System.out.println();

    str = capitals.getProperty("Florida", "Not Found");
    System.out.println("The capital of Florida is "
        + str + ".");
  }
}
