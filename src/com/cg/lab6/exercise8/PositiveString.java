package com.cg.lab6.exercise8;

public class PositiveString {

	boolean positive(String str)
	{
		boolean result=true;
		str=str.toLowerCase();
		char arr[]=str.toCharArray();
		
		for(int i=1;i<arr.length;i++)
		{
		  if(!(arr[i]>arr[i-1]))
		  {
			  result=false;
		  }
		}
		
		return result;
	}
}
