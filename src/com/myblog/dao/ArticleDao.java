package com.myblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myblog.model.Article;
import com.myblog.util.DBUtil;

import net.sf.json.JSONArray;

public class ArticleDao {
	Connection conn;
    PreparedStatement ps;
    ResultSet st;
    String str;
    Article article;
    List<Article> list;
    public ArticleDao() {
    	conn=DBUtil.getInstance();
    }
    public List<Article> getAllArticle() {
    	 String sql="select * from article";
    	 list=new ArrayList<Article>();
		    try {
		    	ps=conn.prepareStatement(sql);	
				st=ps.executeQuery();
			    while(st.next()) {
			    	article=new Article(st.getInt("id"),st.getDate("date"),st.getString("sort"),st.getString("title"),st.getString("showMessage"),st.getString("article"));
                    list.add(article);
                    
			}
			    st.close();
                ps.close();
			    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return list;
		    }
    public List<Article> getSortArticle(String sort){
    	String sql="select * from article where sort=?";
    	list =new ArrayList<Article>();
    	 try {
		    	ps=conn.prepareStatement(sql);	
		    	ps.setString(1,sort);
				st=ps.executeQuery();
			    while(st.next()) {
			    	article=new Article(st.getInt("id"),st.getDate("date"),st.getString("sort"),st.getString("title"),st.getString("showMessage"),st.getString("article"));
                 list.add(article);
                 
			}
			    st.close();
                ps.close();
			    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 
		    return list;
    }
    public void writeArticle(Article article) {
    	 String sql="insert into article (title,showMessage,date,sort,article) values (?,?,?,?,?)";
    	 try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,article.getTitle());
			ps.setString(2, article.getShowMessage());
			java.sql.Date date=new java.sql.Date(article.getDate().getTime());
			ps.setDate(3,date);
			ps.setString(4,article.getSort());
			ps.setString(5,article.getArticle());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
      }
    public int findMaxID() {
    	int maxid=0;
    	String sql="select max(id) from article ";
    	try {
			ps=conn.prepareStatement(sql);
			st=ps.executeQuery();
			while(st.next()) {
				maxid=st.getInt(1);
			}
			st.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return maxid;
    }
    public Article getOnceArticle(int id) {
    	String sql="select * from article where id=?";
    	
    	try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			st=ps.executeQuery();
			while(st.next()) {
				article=new Article(st.getInt("id"),st.getDate("Date"),st.getString("sort"),st.getString("title"),st.getString("showMessage"),st.getString("article"));	
			}
			st.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return article;
    }
    }
