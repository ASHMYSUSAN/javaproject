package oops;

class Parent1
{
	public void job()
	{
		System.out.println("job details");
}
	}
	class Child1 extends Parent1
	{
		public void childmethod()
		{
			System.out.println("child details");
		}
	}
	


public class Singlelevelinheritance {

	public static void main(String[] args) {
		Child1 ob=new Child1();
		
         ob.childmethod();
         ob.job();
	
	}
}
