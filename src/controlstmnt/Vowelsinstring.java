package controlstmnt;

import java.util.Scanner;

public class Vowelsinstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s =sc.next();
		s=s.toLowerCase();
		int count=Vowelsinstring(s);
		System.out.println("vowel count="+count);
	}

	public static int Vowelsinstring(String s)
	{
		int count=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u')
	{
		count++;
	}
	}

	return count;

}
}