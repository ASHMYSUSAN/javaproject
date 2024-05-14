package controlstmnt;

import java.util.Scanner;

public class Oddevenarray {
	public static void main(String[] args) {

	 Scanner sc=new Scanner(System.in);
     
       
     System.out.println("Enter the size of the array: ");
    int n=sc.nextInt();
     
     int ar[]=new int[n];  
     System.out.println("Enter the array values: ");
     for(int i=0;i<n;i++)
     {
         ar[i]=sc.nextInt();   
     }
    
     System.out.println("The Even values are:");
     for(int i=0;i<n;i++)
     {
         if(ar[i]%2==0)
         {
             System.out.print(ar[i]+" ");
         }
     }
     System.out.println(" ");
     
     
     System.out.println("The Odd values are:");
     for(int i=0;i<n;i++)
     {
         if(ar[i]%2!=0)  
         {
             System.out.print(ar[i]+" ");
         }
     }
	
	}}

	


