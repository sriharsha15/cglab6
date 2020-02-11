package com.cg.lab6.exercise4;

public class Consonants {
	public String alterString(String str)
	{
		StringBuffer str1=new StringBuffer();
		char arr[] = str.toCharArray();
		    for(int i=0;i<arr.length;i++)
			  {
				  if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' || arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U' || arr[i]==' ')
				  {
				  str1.append(arr[i]);	  
				  }
				  else
				  {
					  int num1=(int)arr[i];
					  if(num1==90)
						  str1.append((char)65);
					  else if(num1==122)
						  str1.append((char)97);
					  else
						  str1.append((char)++num1);
				  }
			  }
			  return str1.toString();
	}

}
