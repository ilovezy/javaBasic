/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.collect_map_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by a on 2016/12/6.
 */
public class MapTest {
  public Map<String, Student> studentMap;

  public MapTest() {
    this.studentMap = new HashMap<String, Student>();
  }

  public void testPut() {
    Scanner console = new Scanner(System.in);
    int i = 0;
    while (i < 3) {
      System.out.println("请输入学生id: ");
      String ID = console.next();

      // 判断ID是否被占用
      Student st = studentMap.get(ID);
      if (st == null) {
        System.out.println("请输入学生姓名: ");
        String name = console.next();
        Student newStudent = new Student(ID, name);
        studentMap.put(ID, newStudent);
        System.out.println("成功添加学生: " + studentMap.get(ID).name);
        i++;
      } else {
        System.out.println("该学生ID已被占用");
        continue;
      }
    }
  }

  public void testKeySet() {
    Set<String> keySet = studentMap.keySet();

    System.out.println("共有：" + studentMap.size() + "个学生");
    for (String stuId : keySet) {
      Student st = studentMap.get(stuId);
      if (st != null) {
        System.out.println("学生：" + st.name);
      }
    }
  }

  public void testRemove() {
    Scanner console = new Scanner(System.in);

    while (true) {
      System.out.println("请输入要删除的学生id");
      String ID = console.next();
      Student st = studentMap.get(ID);
      if(st == null) {
        System.out.println("输入的id不存在");
        continue;
      }
      studentMap.remove(ID);
      System.out.println("成功删除学生：" + st.name);
      break;
    }
  }

  /**
   * 通过 entrySet来遍历Map
   */
  public void testEntrySet() {
    Set<Map.Entry<String, Student>> entrySet = studentMap.entrySet();
    for (Map.Entry<String, Student> entry: entrySet){
      System.out.println("取得key: " + entry.getKey());
      System.out.println("取得value: " + entry.getValue().name);
    }
  }

  /**
   * 利用put修改Map中的映射
   */
  public void testModify() {
    System.out.println("请输入要修改的学生id: ");
    Scanner console = new Scanner(System.in);
    while (true) {
      String stuId = console.next();
      Student student = studentMap.get(stuId);
      if(student == null) {
        System.out.println("该id不存在，请重新输入");
        continue;
      }
      System.out.println("当前id对应学生为：" + student.name);
      System.out.println("请输入新的学生姓名：");
      String name = console.next();
      Student newStudent = new Student(stuId, name);
      studentMap.put(stuId, newStudent);
      System.out.println("修改成功");
      break;
    }
  }

  public static void main(String[] args){
    MapTest mt = new MapTest();
    mt.testPut();
    mt.testKeySet();
//    mt.testRemove();
//    mt.testEntrySet();
    mt.testModify();
    mt.testEntrySet();

    System.out.println(mt);
  }
}
