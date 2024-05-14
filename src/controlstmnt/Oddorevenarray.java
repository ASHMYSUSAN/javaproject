package controlstmnt;

import java.util.Scanner;

public class Oddorevenarray {

	public static void main(String[] args) {
		int evencount=0,oddcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int a=sc.nextInt();
		int[] ar=new int[a];
		System.out.println("enter values:");
		for(int i=0;i<a;i++)
		{
			ar[i]=sc.nextInt();
		
		if(ar[i]%2==0)
		{
			System.out.println("even num");
			evencount++;
		}
		else
		{
			System.out.println("odd num");
			oddcount++;
		}
		}
	sc.close();
	System.out.println("evencount="+evencount);
	System.out.println("oddcount="+oddcount);
}}
