/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com.lovezy;

/**
 * Created by a on 2016/12/5.
 */
public interface Person {
  String name();

  int age();

  @Deprecated
  void sing();
}
