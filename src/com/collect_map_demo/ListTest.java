/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.collect_map_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

  public List coursesToSelect;

  public ListTest(){
    this.coursesToSelect = new ArrayList();
  }

  public void testAdd() {
    Course cr1 = new Course("1", "数据结构");
    coursesToSelect.add(cr1);
    Course temp = (Course) coursesToSelect.get(0);
    System.out.print("添加了课程：" + temp.id + ":" + temp.name);

    Course cr2 = new Course("2", "c语言");
    coursesToSelect.add(0, cr2);
    Course temp2 = (Course) coursesToSelect.get(0);
    System.out.print("\n");
    System.out.print("添加了课程：" + temp2.id + ":" + temp2.name);

    Course crx = new Course("1", "数据结构");
    coursesToSelect.add(crx);
    Course tempx = (Course) coursesToSelect.get(2);
    System.out.print("添加了课程：" + tempx.id + ":" + tempx.name);

//    Course cr3 = new Course("3", "test");
//    coursesToSelect.add(4, cr3);

    Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
    coursesToSelect.addAll(Arrays.asList(course));
    Course temp3 = (Course) coursesToSelect.get(3);
    Course temp4 = (Course) coursesToSelect.get(4);
    System.out.print("\n" + temp3.id + ':' + temp3.name);
    System.out.print(temp4.id + ':' + temp4.name);

    Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
    coursesToSelect.addAll(2, Arrays.asList(course2));

    Course temp5 = (Course) coursesToSelect.get(2);
    Course temp6 = (Course) coursesToSelect.get(3);
    System.out.print("\n" + temp5.id + ':' + temp5.name);
    System.out.print(temp6.id + ':' + temp6.name);
//    testModify();
//    testRemove();

    testType();

        testForEach();

  }

  public void testGet(){
    int size = coursesToSelect.size();
    System.out.println("\n again");
    for(int i=0; i < size; i++){
      Course tempObj = (Course) coursesToSelect.get(i);
      System.out.println(tempObj.id + ':' + tempObj.name);
    }
  }

  /**
   * 迭代器
   */
  public void testIterator(){
    Iterator it = coursesToSelect.iterator();
    while (it.hasNext()) {
      Course tempObj = (Course) it.next();
      System.out.println("\n" + tempObj.id + ':' + tempObj.name);
    }
  }

  public void testForEach() {
    for (Object obj: coursesToSelect) {
      Course tempObj = (Course) obj;
      System.out.println("\n" + tempObj.id + ':' + tempObj.name);
    }
  }

  /**
   * set list item
   */
  public void testModify() {
    coursesToSelect.set(4, new Course("7", "毛概"));

  }

  /**
   * remove list item
   */
  public void testRemove() {
    Course tempObj = (Course) coursesToSelect.get(4);
    coursesToSelect.remove(tempObj);
    System.out.println("this is " + tempObj);
    System.out.println("delete success");
    testForEach();
  }

  /**
   * add some strange
   */
  public void testType() {
    coursesToSelect.add("i am just a string!!!");
  }

  public static void main(String[] args) {
    ListTest lt = new ListTest();
    lt.testAdd();
  }
}
