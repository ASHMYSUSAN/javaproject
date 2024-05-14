package controlstmnt;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		//-----------------------decision statements practice questions-------------------------

//1.enter a number and displays whether entered number is an odd number or even number.
							/*	int n=51;
								if(n%2==0)
								{
									System.out.println("given number is even");
								}
								else
								{
									System.out.println("given number is odd");}*/
								
						
// 2. enter a number and displays the absolute value of that number.	

					/*	int value=-30;
						if(value<0)
						{
							int v=-value;
							System.out.println("absolute number="+v);
						}
						else
						{
							System.out.println("number="+value);
						}*/
						
//3. Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity. 
//Write a program that asks the user to enter product price and quantity and then calculate the revenue. 
//If the revenue is more than 5000 a discount is 10% offered. 
//Program should display the discount and net revenue.
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter price");
		int p=sc.nextInt();
		System.out.println(" enter quantity");
		int q=sc.nextInt(); 
		
		int revenue=p*q;
	    int	discount=revenue*10/100;
    	System.out.println("revenue is :"+revenue);
		if(revenue>5000)
		{
			
			
			System.out.println("  discount applied is:"+discount+" " +"net revenue="+(revenue-discount));
		
	    }
		else
	    {
		System.out.println("no discount");
	    }	
		*/
// 4. Write a program that asks the user to enter a numbers in three variables and then displays the largest number.

		
	/*	int a=8,b=44,c=11;
		if(a>b && a>c)
		{
			System.out.println("a is larger");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("b is larger");
		}
		
		else
		{
			System.out.println("c is larger");
		}
		*/
		
// 5. The program should then output the number and a message saying whether the number is positive, negative, or zero.	
		
		/*int num=0;
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num<0)
		{
			System.out.println("number is negative");
		}
		else 
		{
			System.out.println("number is zero");
		}
		*/
// 6.	A triangle is valid if the sum of all the three angles is equal to 180 degrees. 
		//Write a program that asks the user to enter three integers as angles 
		//check whether a triangle is valid or not	
		
		/*
		 int a=45,b=55,c=50;
		int sum=a+b+c;
		if(sum==180)
		{
			System.out.println("triangle is valid");
		}
		else
		{
			System.out.println("triangle is invalid");
		}
		
		*/
		
// 7. Write a program to determine whether the year is a leap year or not.

//Leap Years are any year that can be evenly divided by 4.  
//A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.		
		
		/* 
		 int year=1900; //not a leap year,1992,2000=leap year
		if(year%100 ==0 && year%400==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		*/
// 8. Write a program to calculate the monthly telephone bills as per the following rule: 
		//Minimum Rs. 200 for up to 100 calls. 
		//Plus Rs. 0.60 per call for next 50 calls. 
		//Plus Rs. 0.50 per call for next 50 calls. 
		//Plus Rs. 0.40 per call for any call beyond 200 calls.		
		
	    /* int limitcall=290,mincallrate=200,fixedcall=100;
		int extracall=limitcall-fixedcall;
		if(limitcall<=100)
		{
			System.out.println("minimum call rate upto 100 calls(in Rupees):"+""+mincallrate);
			System.out.println("call limit: "+""+limitcall);
			System.out.println(" Total bill="+mincallrate);
		}
		else if(limitcall<=150)
		{
			System.out.println("minimum call rate upto 100 calls(in Rupees):"+""+mincallrate);

			System.out.println("call limit: "+""+limitcall);
			System.out.println("Total bill="+(mincallrate+(0.60*extracall)));
		}
		else if(limitcall<=200)
			
		{
			System.out.println("minimum call rate upto 100 calls(in Rupees):"+""+mincallrate);

			System.out.println("call limit: "+""+limitcall);
			System.out.println("Total bill="+(mincallrate+(0.50*extracall)));
		}
		else if(limitcall>200)
		{
			System.out.println("minimum call rate upto 100 calls(in Rupees):"+""+mincallrate);

			System.out.println("call limit: "+""+limitcall);
			System.out.println("Total bill="+(mincallrate+(0.40*extracall)));
		}
		*/
// 9. The marks obtained by a student in 3 different subjects are input by the user.
//Your program should calculate the average of subjects.		
		
		/*float subj1=90,subj2=80,subj3=90;
		float avg=(subj1+subj2+subj3)/3;
		System.out.println("average mark="+""+avg);
		
		if(avg>=90)
		{
			System.out.println("A GRADE");
		}
		else if(avg>=80)
		{
			System.out.println("B GRADE");
		}
		else if(avg>=70)
		{
			System.out.println("C GRADE"); 
		}
		else if(avg>=60)
		{
			System.out.println("D GRADE"); 
		}	
		else if(avg<60)
		{
			System.out.println("C GRADE"); 
		}
		*/
		
		
// 10.	Write a program that prompts  to enter grade. 
		//Your program should display the corresponding meaning of grade	
		
		/*char grade='E';
		System.out.println("grade="+""+grade);
		switch(grade)
		{
		case 'A':System.out.println("EXCELLENT");
		break;
		case 'B':System.out.println("GOOD");
		break;
		case 'C':System.out.println("AVERAGE");
		break;
		case 'D':System.out.println("DEFICIENT");
		break;
		case 'E':System.out.println("FAIL");
		break;
		default:System.out.println("invalid input");
		
		}
		*/
		
// 11. Write a program that prompts the user to enter three names. 
		//Your program should display the names in descending order
		//String name1="asd",name2="gty",name3="pki";
		
		
//----------------ITERATIVE STATEMENTS--------------------

// 1.Write a program that prompts the user to input a positive integer. 
		//It should then print the multiplication table of that number.
		
		
	/*	for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*7="+i*7);
		}
		*/
// 2.Write a program to find the factorial value of any number
		
	/*	int fact=1;
		int num=5;
		
		for(int i=1;i<=5;i++)
		{
			 fact=fact*i;
		}
		
		System.out.println("factorial="+fact);
		*/
// 3.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed
		
		
	/*int num	=12345,rev=0;
	while(num>0)
	{
		int temp=num;
		num=temp/10;
	int n=temp%10;
		
	rev=n*10+rev;
	
	System.out.println("reverse="+rev);
	}
		*/
		
		
// 4.Write a program that reads a set of integers, and then prints the sum of the even and odd integers		
		

	/*	int oddcount=0,evencount=0;
		Scanner sc=new Scanner(System.in);
		char choice=0;
		do
		{
			System.out.println("enter num");
		int num	=sc.nextInt();
		if(num%2==0)
		{
			evencount=evencount+num;
		}
		else
		{
			oddcount=oddcount+num;
		}
		System.out.println("sum of even="+evencount);
		System.out.println("sum of odd="+oddcount);
		System.out.println("want to continue: y/n");
		 choice=sc.next().charAt(0);
		
		
		}while(choice=='y' || choice=='Y');
		
*/
// 5.Write a program that CHECK whether the number is a prime number.		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		
		int num	=sc.nextInt();
		if(num==1)
		{
			System.out.println("not prime");
			return;
		}
		
		for(int i=2;i<num;i++)
			
		{
			if(num%2==0)
		{
			System.out.println("not prime");
			return;
		}
			
		}
		
		System.out.println("prime");
		}}  */   
		
		
// 6. Write a program to calculate HCF of Two given number.
		
		
	/*	Scanner sc=new Scanner(System.in);
	    int r,hcf;
		System.out.println("enter first num");
		int divident=sc.nextInt();
		System.out.println("enter second num");
		int divisor=sc.nextInt();
		
		do
		{
			
		r=divident%divisor;
	if(r==0)
	{
		 hcf=divisor;
	}
	else
	{
		int dividend = divisor;
         divisor = r;
	}
		}while(r!=0);
		

        System.out.println("HCF: "  +hcf);	
		
		*/
// 7. Write a do-while loop that asks the user to enter two numbers.
		//The numbers should be added and the sum displayed	
		//The loop should ask the user whether he or she wishes to perform the operation again.
		//If so, the loop should repeat; otherwise it should terminate. 
		/*Scanner sc=new Scanner(System.in);
			
		char choice;
		do
		{System.out.println("enter first num");
		int num1=sc.nextInt();
		System.out.println("enter second num");
		int num2=sc.nextInt();
			int sum=num1+num2;
			System.out.println("sum value="+sum);
			System.out.println("do u want to continue:y/n");
			 choice=sc.next().charAt(0);
			
		}while(choice=='y' || choice=='Y');
		*/
// 8. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.		
		
		/*Scanner sc=new Scanner(System.in);
		int positivecount=0,negativecount=0,zerocount=0;
		
		char choice = 0;
		do
		{
			System.out.println("enter  num");
			int num=sc.nextInt();
		if(num>0)
		{
			positivecount++;
			
		}
		else if(num<0)
		{
           negativecount++;
			
		}
		else
		{
			zerocount++;
		}
		System.out.println("count of positive count="+positivecount);
		System.out.println("count of negative count="+negativecount);
		System.out.println("count of zeros="+zerocount);
		System.out.println("do u want to continue:y/n");
		  choice = sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
		*/
// 9. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered		
		
	/*	Scanner sc=new Scanner(System.in);
		//int largestcount=0,smallestcount=0;
		
		char choice = 0;
		int max=0,min=0;
		do
		{
			System.out.println("enter  num");
			int num=sc.nextInt();
		if(num>max)
		{
			max=num;
			
		}
		
		 if(num<min)
		{
        min=num;		
        }
		
		System.out.println("do u want to continue:y/n");
		  choice = sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
        System.out.println("largest="+max);
		
		System.out.println("smallest="+min);
	}}
*/
		
// 10. Write a program to print out all Armstrong numbers between 1 and 500.
		//Write a program to print out all Armstrong numbers between 1 and 500.
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int rem,temp=num,value=0;
		while(num>0)
		{
			rem=num%10;//3//5
			value=value+(rem*rem*rem);//27//125+27=152//
			num=num/10;//15//1
			
		}
		if(temp==value)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
		*/
		
		
// 11.
		Scanner sc=new Scanner(System.in);
		int p=0,n=0;
		System.out.println("enter array size");
		
		int s=sc.nextInt();
		int[] ar=new int[s];
		
		System.out.println("enter numbers");
		for(int i=0;i<s;i++)
		{
				ar[i]=sc.nextInt();
				}
		for(int i=0;i<s;i++)
		{
	
if(ar[i]<0)
{
	n++;
}
else if(ar[i]>0)
{
	p++;
}}
			
	
				System.out.println("positive="+p);
				System.out.println("negative="+n);

				}}
