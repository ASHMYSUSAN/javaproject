package oops;

abstract class Animal2
{
	abstract public void animalmethod();
	public void sleeping()
	{
		System.out.println("animalsleep");
	}
}


class cat extends Animal2
{

	@Override
	public void animalmethod() {
		System.out.println("cat");
		
	}
	
}

public class Abstractpgm {

	public static void main(String[] args) {
		cat ob=new cat();
	ob.animalmethod();
	ob.sleeping();
	}

}
