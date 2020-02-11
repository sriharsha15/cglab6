package com.cg.lab6.exercise5;

public class Digit 
{
int modifyNumber(int number1)
{
	String str=Integer.toString(number1);
	char arr[]=str.toCharArray();
	StringBuffer os=new StringBuffer();
	os.append(arr[arr.length-1]);
	int output=0;
	for(int i=arr.length-1;i>0;i--)
	{
	 int temp=Math.abs((int)arr[i]-(int)arr[i-1]);
	 os.append(temp);
	}
	os.reverse();
	output=Integer.parseInt(os.toString());
	return output;

}
}
