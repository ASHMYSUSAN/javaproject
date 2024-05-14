package oops;

class parent
{
	public void job()
	{
		System.out.println("job details");
	}
	
}
class child extends parent
{
	public void childmethod()
	{
		System.out.println("child details");
	}
}
class grandchild extends child
{
	public void grandchildmethod()
	{
		System.out.println("grandchild details");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
		
		grandchild ob=new grandchild();
		ob.grandchildmethod();
		ob.childmethod();
		ob.job();

	}

}
