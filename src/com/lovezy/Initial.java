/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.lovezy;

/**
 * Created by a on 2016/12/3.
 */
public class Initial {
  public static void main(String[] args) {
    Girls girl = new Girls();

    System.out.println(girl.age);

    girl.eat();

    Cc cc = new Cc();
    cc.age = 10;
    cc.name = "heli";
    cc.eat();
    cc.method();
  }
}
