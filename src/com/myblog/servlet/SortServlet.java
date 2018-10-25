package com.myblog.servlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myblog.service.SortService;
import com.myblog.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SortServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{	
		doPost(request,response);
	} 	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//doGet(request,response);
/*		JSONObject jo=new JSONObject();
		jo.put("name","java");
		JSONObject jo1=new JSONObject();
		jo1.put("name","SVN");
		JSONArray ja=new JSONArray();
		ja.add(jo);
		ja.add(jo1);
		PrintWriter print=response.getWriter();
		print.print(ja);*/
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		List<String> sort=new ArrayList<String>();
		SortService ss=new SortService();
		String str=request.getParameter("sort");
		if(str!=null) {
		sort=ss.showSort(str);
		}
		else {
			sort=ss.showSubject();
			
		}
		JSONArray ja=new JSONArray();
		for(int i=0;i<sort.size();i++) {
			ja.add(sort.get(i));
		}
		PrintWriter pw=response.getWriter();
		pw.print(ja);
		System.out.println("我在运行");
		//sort=ss.showSort(request.getParameter("str"));
		/*System.out.println(request.getParameter("wid"));
	    for(int i=0;i<sort.size();i++) {
	    	ja.addAll(sort);
	    }
	    PrintWriter print=response.getWriter();
	    print.print(ja);
	    System.out.println(ja);*/
/*		System.out.println(request.getParameter("wid"));*/
	}


			
}
