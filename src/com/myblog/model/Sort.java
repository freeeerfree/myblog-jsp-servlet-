package com.myblog.model;

public class Sort {
    int id;
    String hSort;
    String lSort;
    public Sort(String hSort,String lSort) {
    	this.hSort=hSort;
    	this.lSort=lSort;
    }
    public String  getLSort() {
         return lSort;
    }
    public void setLSort(String aSort) {
    	this.lSort=aSort;
    }
    public void setHSort(String aSort) {
    	this.hSort=aSort;
    }
    public String getHSort() {
    	return hSort;
    }
}
