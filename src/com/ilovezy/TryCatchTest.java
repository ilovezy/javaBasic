/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.ilovezy;

/**
 * Created by a on 2016/12/5.
 */
public class TryCatchTest {
  public static void main(String[] args) {
    TryCatchTest tct = new TryCatchTest();
    tct.test();
  }

  /**
   * divider(除数)
   * result(结果)
   * try-catch
   * @return
   */
  public int test() {
    int divider = 10;
    int result = 100;
    try {
      while(divider > -1) {
        divider--;
        result = result + 100 / divider;
      }
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("循环抛出异常");
      return -1;
    }
  }
}
