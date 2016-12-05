/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.lovezy;

/**
 * Created by a on 2016/12/3.
 */
public class Girls implements IPlayGame {
  public int age = 10;
  public String name;

  public void eat() {
    System.out.println("girls can eat");
  }

  public Girls() {
    System.out.println("girls done!!");
    age = 20;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void playGame(){
    System.out.println("has playgame");
  }
}
