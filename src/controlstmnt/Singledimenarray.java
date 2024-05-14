package controlstmnt;

import java.util.Scanner;

public class Singledimenarray {

	public static void main(String[] args) {
//count of positive,negative,zeros in an 1d array
		int positivecount=0,negtivecount=0,z=0;
		int[] a=new int[6];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		

		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<6;i++)
		{
			if(a[i]==0)
		
			{
				z++;
			}
		
			else if(a[i]<0)
			{
				negtivecount++;
			}
			else
			{
				positivecount++;
			}
			


	}
		
		System.out.println("zerocount="+z);
		System.out.println("positivecount="+positivecount);
		System.out.println("negativecount="+negtivecount);
		sc.close();
}}
