package com.myblog.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myblog.dao.ArticleDao;
import com.myblog.dao.SortDao;
import com.myblog.model.Article;
import com.myblog.service.ArticleService;

/*import java.util.ArrayList;
import java.util.List;*/

import com.myblog.service.SortService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  List list=new ArrayList();
           SortService ss=new SortService();
           list=ss.showSort("首页");
           for(int i=0;i<list.size();i++) {
        	   System.out.println(list.get(i));
           }*/
		
		/*JSONObject jo=new JSONObject();
		jo.put("name","java");
		JSONArray ja=new JSONArray();
		ja.add(jo);
		System.out.print(ja);*/
/*	ArticleDao ad=new ArticleDao();
	List<Article> list=new ArrayList<Article>();
	list =ad.getAllArticle();
	Article article=list.get(0);
	System.out.println(article.getTitle());*/
/*		JSONArray ja=new JSONArray();
		ArticleService as=new ArticleService();
		ja=as.getSortArticle("css");
		System.out.println(ja);*/
/*		String sort="所有";
		String str="所有";
		System.out.println(sort);
		System.out.println(str);
		System.out.println(sort==str);
		System.out.println(sort.equals(str));*/
/*		Date date=new Date();
		Article article=new Article(5,date,"java","title4","showMessage","article4");
		ArticleDao ad=new ArticleDao();
		ad.writeArticle(article);*/
/*		SortDao sd=new SortDao();
		List<String> sort=new ArrayList<String>(); 
		sort=sd.getAllSort();
		for(int i=0;i<sort.size();i++)
		System.out.println(sort.get(i));*/
/*		ArticleDao ad=new ArticleDao();
		Article article=ad.getOnceArticle(1);
		System.out.println(article);
		System.out.println(article.getDate());*/
		ArticleService as=new ArticleService();
		
		System.out.println(as.showOnceArticle(1));
	
	}

}
