package controlstmnt;

public class Areaofshapes {

	public static void main(String[] args) {
Areaofshapes ob=new Areaofshapes();
ob.circle();
ob.square(10);
double rectangle=ob.rectangle(20.5,5.2);
System.out.println("rectangle="+rectangle);
double d=ob.triangle();
System.out.println("area of triangle="+d);


	}
	
	
	//
	public void circle()
	{
		double r=3.14,b=3.1;
		double a=r*b*b;
		System.out.println("area of circle="+a);
	}
	
	//
	public void square(double a)
	
	{
	double c=a*a;
	System.out.println("area of square="+c);
	}
	
	//
	public double rectangle(double l,double b)
	{
		
		double r=l*b;
		return r;
	}
	//
	
	public double triangle()
	{
		double a=2,b=6,c=0.5;
		double d= a*b*c;
		return d;
	}
	
	
	
	}
	
	
	
	
	


