package com.myblog.test;

import java.util.ArrayList;
import java.util.List;

import com.myblog.service.SortService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List list=new ArrayList();
           SortService ss=new SortService();
           list=ss.showSort("首页");
           for(int i=0;i<list.size();i++) {
        	   System.out.println(list.get(i));
           }
	}

}
