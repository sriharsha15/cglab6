package com.cg.lab6.exercise1;

import java.util.StringTokenizer;

public class Tokenizer {
	void display(String str) 
	{
		
		StringTokenizer st=new StringTokenizer(str," ");
		int sum=0;
		while(st.hasMoreTokens())
		{
			String temp=st.nextToken();
			int n=Integer.parseInt(temp);
			System.out.println(n);
			sum=sum+n;
			
		}
		System.out.println(sum);
	}
}
