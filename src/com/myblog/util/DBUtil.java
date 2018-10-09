package com.myblog.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String URL="jdbc:mysql://localhost:3306/free?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=UTC";
	private static String USER="root";
	private static String PASSWORD="123456aa";
	static Connection conn;
       static {
    	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
    private final static DBUtil db=new DBUtil();
    public static Connection getInstance() {
    	return conn;
    }

}
