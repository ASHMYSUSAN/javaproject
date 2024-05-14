package oops;

import java.util.Scanner;

public class Countrepeatedchara {

	public static void main(String[] args) {
		
		String s="malayalam";
		char[] str=s.toCharArray();
		int count;

//System.out.println("repeated characters count=");
for(int i=0;i<s.length();i++)
{
	count=1;
	
	for(int j=i+1;j<s.length();j++)
	{
		if(str[i]==str[j])
		{
			count++;
			str[j]='0';
		
			
		}}
	if(count>1 && str[i]!='0')
	{
		System.out.println("repeated character are:"+str[i]);
		System.out.println("count="+count);
	
	
}



	}

}}
