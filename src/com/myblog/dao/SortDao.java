package com.myblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.myblog.util.DBUtil;

public class SortDao {
      Connection conn;
      PreparedStatement ps;
      ResultSet st;
      List<String> sort;
      public List<String>  getSort(String head) {
    	  conn=DBUtil.getInstance();
           sort =new ArrayList<String>();
    	  String sql="select * from sort where sort=?";
    	  try {
			ps=conn.prepareStatement(sql);
		    ps.setString(1, head);
		    st=ps.executeQuery();
		    while(st.next()==true) {
		    	sort.add(st.getString(3));
		    }
		      st.close();
	    	  ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
        return sort;
    	 
      }
      public List<String>  getAllSort() {
    	  conn=DBUtil.getInstance();
           sort =new ArrayList<String>();
    	  String sql="select lsort from sort where sort!='首页'";
    	  try {
			ps=conn.prepareStatement(sql);
		    st=ps.executeQuery();
		    while(st.next()==true) {
		    	sort.add(st.getString(1));
		    }
		      st.close();
	    	  ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
        return sort;
    	 
      }
      
}
