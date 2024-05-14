package oops;

class Father
{
	public void phone()
	{
		System.out.println("samsung");
	}
}
class son extends Father


{
	@Override//-----type before writing anything inside method
	public void phone()
	{
		
	System.out.println("iphone");
	super.phone();
	}
}


public class Methodoverriding {

	public static void main(String[] args) {
		son ob=new son();
		ob.phone();

	}

}
