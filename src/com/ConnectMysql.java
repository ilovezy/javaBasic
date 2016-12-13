/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

package com;

import java.sql.*;

public class ConnectMysql {
  // jdbc 驱动名？数据库url
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost:3306/test";
  static final String USER = "root";
  static final String PASS = "aaa";

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
      // 注册 JDBC 驱动
      Class.forName(JDBC_DRIVER);

      // 打开链接
      System.out.println("连接数据库...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      // 执行查询
      System.out.println(" 实例化Statement对...");
      stmt = conn.createStatement();
      String sql = "SELECT * FROM websites";
      ResultSet rs = stmt.executeQuery(sql);

      // 展开结果集数据库
      while(rs.next()){
        // 通过字段检索
        int id  = rs.getInt("id");
        String name = rs.getString("name");
        String url = rs.getString("url");
        int alexa = rs.getInt("alexa");

        // 输出数据
        System.out.print("ID: " + id);
        System.out.print(", 站点名称: " + name);
        System.out.print(", 站点URL: " + url);
        System.out.print(", alexa排名: " + alexa);
        System.out.print("\n");
      }
      // 完成后关闭
      rs.close();
      stmt.close();
      conn.close();
    }catch(SQLException se){
      // 处理 JDBC 错误
      se.printStackTrace();
    }catch(Exception e){
      // 处理 Class.forName 错误
      e.printStackTrace();
    }finally{
      // 关闭资源
      try{
        if(stmt!=null) stmt.close();
      }catch(SQLException se2){
      }// 什么都不做
      try{
        if(conn!=null) conn.close();
      }catch(SQLException se){
        se.printStackTrace();
      }
    }
    System.out.println("Goodbye!");
  }
}
