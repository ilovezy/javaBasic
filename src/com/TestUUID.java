/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com;

import java.util.UUID;

public class TestUUID {
  public static void main(String[] args) {
    String s = UUID.randomUUID().toString();
    UUID tempUuid = UUID.randomUUID();
    System.out.println(s);
    System.out.println(tempUuid);
  }
}
