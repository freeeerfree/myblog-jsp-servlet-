package com.myblog.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myblog.service.ArticleService;

import net.sf.json.JSONArray;

public class OnceArticleServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{	
		doPost(request,response);
	} 	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	 
	  request.setCharacterEncoding("utf-8");
	  response.setCharacterEncoding("utf-8");	  
      int id=Integer.valueOf(request.getParameter("id"));
      ArticleService as=new ArticleService();
      PrintWriter pw=response.getWriter();
      pw.print(as.showOnceArticle(id));
	}
}
