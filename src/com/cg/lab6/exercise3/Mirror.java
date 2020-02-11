package com.cg.lab6.exercise3;

public class Mirror {

	String getImage(String str)
	{
		StringBuffer str1=new StringBuffer();
		str1.append(str);
		str1.reverse();
		StringBuffer str2=new StringBuffer(str+"|"+str1);
		return str2.toString();
	}
}
