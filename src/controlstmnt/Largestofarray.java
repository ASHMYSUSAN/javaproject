package controlstmnt;

import java.util.Scanner;

public class Largestofarray {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int a=sc.nextInt();
int ar[]=new int[a];
System.out.println("enter numbers");
for(int i=0;i<a;i++)
{
 ar[i]=sc.nextInt();
}
int max=0;
for(int i=0;i<a;i++)
{
if(ar[i]>max)
{
	max=ar[i];
}
else
{
	max=max;
}
	
}
System.out.println("largest number="+max);
sc.close();
	}
	
}
