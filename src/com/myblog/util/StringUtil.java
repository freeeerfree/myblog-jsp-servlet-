package com.myblog.util;

import java.io.UnsupportedEncodingException;

public class StringUtil {


	public static String pareCode(String str) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return new String(str.getBytes("ISO-8859-1"),"UTF-8");
	}
}
