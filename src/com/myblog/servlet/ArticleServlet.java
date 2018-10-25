package com.myblog.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myblog.service.ArticleService;


import net.sf.json.JSONArray;

public class ArticleServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{	
		doPost(request,response);
	} 	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	 
	  request.setCharacterEncoding("utf-8");
	  response.setCharacterEncoding("utf-8");	  
       ArticleService as=new ArticleService();
       JSONArray ja=new JSONArray();
       /*if(request.getParameter("sort")=="null")
       {ja=as.getAllArticle();}
       else
       {ja=as.getSortArticle(request.getParameter("sort"));}*/
       String sort=request.getParameter("sort");
       String str="所有";
/*       if() {
    	   System.out.println("相等");
       }
       else {
    	   System.out.println("不相等");
       }*/
       if(sort==null) {
    	   ja=as.getAllArticle();
       }
       else {
       if(sort.equals(str)) {
    	   ja=as.getAllArticle();
       }
       else {
    	   ja=as.getSortArticle(sort);
       }
       }
       PrintWriter pw=response.getWriter();
       pw.print(ja);
	}
}