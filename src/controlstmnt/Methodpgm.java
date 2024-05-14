package controlstmnt;

public class Methodpgm {

	public static void main(String[] args) {

	

	
	Methodpgm ob=new Methodpgm();
	ob.add();
	ob.sub(40,3);
	int mul=ob.mul(20, 5);
	System.out.println("mul="+mul);
	double d=ob.div();
	System.out.println("div="+d);
	}
	
	//method without parameter and without return type

	public void add()
	{
	int a=20,b=30;
	int c=a+b;
System.out.println("add="+c);	
	}
	
	// with parameter without return type
	
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("sub="+c);
	}
	
	//with parameter with return type
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
		}
	
	
	//without parameter with return type
	
	public double div()
	{
		int a=3,b=2;
		double c=a/b;
		return c;
	}
	
	
	
	
	
}

	
	
	

