package controlstmnt;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("length");
		
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int a1=0;
int a2=1;
int sum=0;
System.out.println("fibnocci is ");
for(int i=0;i<l;i++)
{
System.out.println(a1 +"");
sum=a1+a2;
a1=a2;
a2=sum;

	}

sc.close();
}
}
