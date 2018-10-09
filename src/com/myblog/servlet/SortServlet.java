package com.myblog.servlet;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myblog.service.SortService;
import com.myblog.util.StringUtil;

public class SortServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, UnsupportedEncodingException{	
		List<String> sort=new ArrayList<String>();
          SortService ss=new SortService();
          String str=request.getParameter("sort");      
          sort=ss.showSort(StringUtil.pareCode(str));
          for(int i=0;i<sort.size();i++) {
       	   System.out.println(sort.get(i));
          }
	} 	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, UnsupportedEncodingException {
		doGet(request,response);
	}


			
}
