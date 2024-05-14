package controlstmnt;

import java.util.Scanner;

public class Repeatingchara {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	           
	     System.out.println("Enter string: ");
	    String str=sc.next();
	    char[] s=str.toCharArray();
	    int count;
	    for(int i=0;i<str.length();i++)
	    {
	    	count=1;
	    	  for(int j=i+1;j<str.length();j++) 	
	    	  {
	    		  if(s[i]==s[j])
	    		  {
	    			  count++;
	    			  s[j]='0';
	    		  }
	    	  }
	    	  if(count>1 && s[i]!='0')
	    	  {
	    		  System.out.println("repeating chara:"+s[i]);
	    		  System.out.println("count="+count);
	    	  }
	    }
	}

}
