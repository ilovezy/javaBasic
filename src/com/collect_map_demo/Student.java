/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.collect_map_demo;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 */
public class Student {
  public String id;
  public String name;

  public Set courses;

  public Student(String id, String name) {
    this.id = id;
    this.name = name;

    this.courses = new HashSet();
  }
}
