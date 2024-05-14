package oops;

class animal
{
	public void animalmethod()
	{
		System.out.println("animal method details");
	}
}
class tiger extends animal
{
	public void tigermethod()
	{
		System.out.println("tiger method details");
	}
}

class lion extends animal
{
	public void lionmethod()
	{
		System.out.println("lion details");
	}
}


public class Hierarchialinheritance {

	public static void main(String[] args) {
		tiger ob=new tiger();
		ob.animalmethod();
		lion ob1=new lion();
		ob1.animalmethod();

	}

}
