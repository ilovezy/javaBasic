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
    Girls girl2 = new Girls();

    girl.age = 14;
    girl2.age = 15;

    System.out.println(girl.equals(girl2));

    IPlayGame ip1 = new Girls();
    IPlayGame ip2 = new Psp();

    ip1.playGame();
    ip2.playGame();

    IPlayGame ip3 = new IPlayGame() {
      @Override
      public void playGame() {
        System.out.println("use no name");
      }
    };

    ip3.playGame();

    new IPlayGame(){
      public void playGame() {
        System.out.println("use no name2");
      }
    }.playGame();
  }
}
