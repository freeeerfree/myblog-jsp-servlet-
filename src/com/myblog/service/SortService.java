package com.myblog.service;

import java.util.ArrayList;
import java.util.List;

import com.myblog.dao.SortDao;

public class SortService {
	SortDao sd;
	List<String> sort;
     public List<String> showSort(String head) {
    	 sd=new SortDao();
    	 sort=new ArrayList();
    	 sort=sd.getSort(head);
    	 return sort;
     }
}
