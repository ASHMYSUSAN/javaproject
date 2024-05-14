package controlstmnt;

//import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		
	//1.	calculate the area and perimeter of the rectangle
	/*int a=5,b=7;
	int area=a*b;
	int perimeter=2*(a+b);
	System.out.println("area="+area);
	System.out.println("perimeter="+perimeter);*/
		
		
	//2.   perimeter of triangle
		
		/*int a=2,b=3,c=5;
		int perimeter=a*b*c;
		System.out.println("p of triangle="+perimeter);*/
		
		
	//3. arithematic operators
		
		//System.out.println("result ="+((((2345+8)/3)%5)*5));
		
		
	//4. assignment operators
		/*int a=2345;
		int b=8;
		System.out.println("a+=b="+(a+=b));
		System.out.println("a-=b="+(a-=b));
		System.out.println("a*=b="+(a*=b));
		System.out.println("a/=b="+(a/=b));*/
		
	//5. check two number is equal
		//int a=23,b=45;
		//System.out.println(a==b);

    //6. Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are tru
	
		
		//int a=55,b=70;
		//System.out.println(a<b && a<50);
		
	//7. check if atleast one of the conditions 'a < 50' or 'a < b' is true
		
		//int a=55,b=70;
		//System.out.println(a<b || a<50);
		
	//8. If the marks of Robert in three subjects are 78,45 and 62 respectively
	//	(each out of 100 ), write a program to calculate his total marks and percentage marks.	
		
		/*int a=78,b=45,c=62;
		int sum=a+b+c;
		float percentage=sum/3;
		System.out.println("total="+sum+" "+"percentage="+percentage);*/
		
		
	//9.
		/*int total=90;
		
		int Agrade=(50/100)*total;
		int Agradeboys=20;
		System.out.println("total num of girls getting grade 'A'="+(Agrade-Agradeboys));*/
		
     //10.
		
	/*int num=12345,f,s,t,fo,fi;
	f=num/10000;//1
	num=num%10000;//2345
	s=num/1000;//2
	num=num%1000;//345
	t=num/100;//3
	num=num%100;//45
	fo=num/10;//4
	num=num%10;//5
	fi=num/1;//5
	num=num%1;//0
	
	System.out.println("sum="+(f+fo));  */
	
	
	//11.   if the number which was taken is 5696, then the displayed number should be 7818	
		
		/*int num=1234;//number=3456
		
		int f=num/1000;//1
		int s1=f+2;//3
		num=num%1000;//234
		int s=num/100;//2
		int s2=s+2;//4
		num=num%100;//34
		int t=num/10;//3
		int s3=t+2;//5
		num=num%10;//4
		int fo=num/1;//4
		int s4=fo+2;//6
		num=num%1;//0
		
		
		System.out.println("number="+s1+s2+s3+s4);*/
		
	//12. Write a program to calculate the sum of the digits of a 3-digit number.	
		
		/*int num=123,f,s,t,fo;
		
		f=num/100;
		num=num%100;
		s=num/10;
		num=num%10;
		t=num/1;
		num=num%1;
		System.out.println("number="+(f+s+t));*/
		
		
	//13.Write a program to reverse a 3-digit number
		
		/*int num=123,first,second,third;
		 first=num/100;//1
		 num=num%100;//23
		 second=num/10;//2
		 third=num%10;//3
		
		int rev=third*100+second*10+first;
		System.out.println("reverse="+rev);*/
		
		
		
	}	
}

