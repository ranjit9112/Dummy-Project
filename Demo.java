package com.anil.palindro;

public class Demo {

	public static void main(String[] args) {
	String str="nitin";
	String str1="";
	int length = str.length();
	for(int i=length-1; i>0;--i)
	{
		str1=str1+str.charAt(i);
		
	}if(str.equals(str1))
	{
		System.out.println(str +" is palindrom");
	}else
	{
		System.out.println(str+" is not palindrom");
	}
	

	}

}
