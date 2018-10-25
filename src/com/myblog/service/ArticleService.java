package com.myblog.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myblog.dao.ArticleDao;
import com.myblog.model.Article;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ArticleService {
    //从数据库提取所有文章打包成json 对象
	JSONObject jo;
	JSONArray ja;
	ArticleDao ad;
	List<Article> list;
	Article article;
	public ArticleService() {
		
	}
	public JSONArray getAllArticle() {
		ad=new ArticleDao();
		list=new ArrayList<Article>();
		list=ad.getAllArticle();
		ja=new JSONArray();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<list.size();i++){
			article=list.get(i);
			jo=new JSONObject();
			jo.put("id", article.getId());
			jo.put("title", article.getTitle());
			jo.put("showMessage", article.getShowMessage());
			String date=sdf.format(article.getDate());
			jo.put("date",date);
			ja.add(jo);
		}
		return ja;
	}
	
	public JSONArray getSortArticle(String sort) {
		ad=new ArticleDao();
		list=new ArrayList<Article>();
		list=ad.getSortArticle(sort);
		ja=new JSONArray();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<list.size();i++){
			article=list.get(i);
			jo=new JSONObject();
			jo.put("id", article.getId());
			jo.put("title", article.getTitle());
			jo.put("showMessage", article.getShowMessage());
			String date=sdf.format(article.getDate());
			jo.put("date",date);
			ja.add(jo);
		}
		return ja;
	}
	public void addArticle(String title,String sort,String showMessage,String article) {
		 ad=new ArticleDao();
		 int id=ad.findMaxID();
		 Date date=new Date();
		 Article newArticle=new Article(id+1,date,sort,title,showMessage,article);
		 ad.writeArticle(newArticle);
	}
	public JSONObject showOnceArticle(int id) {
		ad=new ArticleDao();
        jo=new JSONObject();
		Article article=ad.getOnceArticle(id);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		jo.put("id", article.getId());
		jo.put("title", article.getTitle());
		jo.put("showMessage", article.getShowMessage());
		String date=sdf.format(article.getDate());
		jo.put("date",date);
		jo.put("article", article.getArticle());
		return jo;

	}
}
