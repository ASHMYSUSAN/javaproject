package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add(20, 30);
		ob.add(11, 21, 32);
		ob.add(21.6, 60);
		ob.add(20, 19.5);
		

	}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,int b,int c)//-------changing number of arguments
{
	float d=a+b+c;
	System.out.println(d);
}

public void add(double a,int b)//------changing data type
{
	double c=a+b;
	System.out.println(c);
}
public void add(int a,double b)//---changing order of parameter
{
	double c=a+b;
	System.out.println(c);
}
	
}
