/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.collect_map_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 2016/12/6.
 */
public class TestGeneric {

  public List<Course> courses;

  public TestGeneric() {
    this.courses = new ArrayList<>();
  }

  public void testAdd() {
    Course cr1 = new Course("1", "大学语文");
    courses.add(cr1);
//    courses.add("what the fuck???");
    Course cr2 = new Course("2", "java basic");
    courses.add(cr2);
  }

  public void testForEach() {
    for(Course cr: courses) {
      System.out.println(cr.id + ": " + cr.name);
    }
  }

  public void testChild() {
    ChildCourse ccr = new ChildCourse();
    ccr.id = "3";
    ccr.name = "我是子类型的课程对象实例~~~";
    courses.add(ccr);
  }



  public static void main(String[] args) {
    TestGeneric tg = new TestGeneric();
    tg.testAdd();
    tg.testForEach();
    tg.testChild();
    tg.testForEach();
  }
}
