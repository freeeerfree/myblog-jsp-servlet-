package com.myblog.model;

import java.util.Date;

public class Article {
    int id;
    Date date;
    String sort;
    String title;
    String showMessage;
    String article;
    public Article(int id,Date date,String sort,String title,String showMessage,String article ) {
   	   this.id=id;
   	   this.date=date;
   	   this.sort=sort;
   	   this.title=title;
   	   this.showMessage=showMessage;
   	   this.article=article;
    }
    public int getId() {
   	 return this.id;
    }
    public void setId(int aid) {
       this.id=aid;
    }
    public Date getDate() {
   	 return date;
    }
    public void setDate(Date date) {
   	 this.date=date;
    }
    public void setSort(String sort) {
   	 this.sort=sort;
    }
    public String getSort() {
   	 return this.sort;
    }
    public String getTitle() {
   	 return title;
    }
    public void setTitle(String title) {
   	 this.title=title;
    }
    public String getShowMessage() {
   	 return showMessage;
    }
    public void setShowMessage(String showMessage) {
   	 this.showMessage=showMessage;
    }
    public String getArticle() {
   	 return article;
    }
    public void setArticle(String article) {
   	 this.article=article;
    }
}
