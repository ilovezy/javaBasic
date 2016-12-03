/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.lovezy;

/**
 * Created by a on 2016/12/3.
 */
public class Cc extends Girls {
  public int age = 30;

  public void eat() {
    System.out.println("cc can eat!!!!!!!!!1");
  }

  public Cc() {
    System.out.println("cc can");
  }

  public void method(){
    System.out.print(super.age);
    System.out.print(age);
  }
}
