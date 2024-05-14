package pkg;

public class Operators {

	public static void main(String[] args) {
		
		//ARITHMETIC OPERATORS
		int a,b;
		 a=20;
		 b=30;
		 System.out.println("a+b="+(a+b));
		 System.out.println("a-b="+(a-b));
		 System.out.println("a*b="+(a*b));
		 System.out.println("a/b="+(a/b));
		 System.out.println("a%b="+(a%b));
		 
		 
		//assignment operators
		 
		 int a1,b1;
		 a1=20;
		 b1=30;	
		 System.out.println("a1+=b1="+(a1+=b1));
		 System.out.println("a1-=b1="+(a1-=b1));
		 
		 //relational
		 
		 
		 int a2,b2;
		 a2=20;
		 b2=30;	
		 System.out.println("a2==b2="+(a2==b2));
		 System.out.println("a2<b2="+(a2<b2));
		 System.out.println("a2>b2="+(a2>b2));
		 System.out.println("a2<=b2="+(a2<=b2));
		 System.out.println("a2>=b2="+(a2>=b2));
		 System.out.println("a2!=b2="+(a2!=b2));
		 
		 //logical
		// String username,paswd;
		String username="abc";
		String pswd="abc123";
		System.out.println(username=="abc" && pswd=="abc123");
		System.out.println(username=="abc" || pswd=="abc123");
		System.out.println(!(username=="abc" ));
		
		//unary operators
		
		int a3=6,p3=2;
		System.out.println(a3++);//post increment
		System.out.println(a3);
		System.out.println(++a3);//pre-increment
		
		System.out.println(p3--);// post decrement
		System.out.println(p3);
		System.out.println(--p3);//pre-decrement

		
		//ternary operator
	
		String s=a2>b2?"a2 is greater":"b2 is greater";
		System.out.println(s);
		 
		 
	}

}
