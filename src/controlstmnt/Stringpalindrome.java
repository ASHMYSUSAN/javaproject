package controlstmnt;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
String s=sc.next();
String rev="";
//System.out.println("length is="+s.length());
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);

}
if(s.equals(rev))
{
System.out.println("palindrome");

	}
	
else
{
	System.out.println("not palindrome");
}
sc.close();
}
	
}