package controlstmnt;

public class Age {

	public static void main(String[] args) {
		int age,weight;
		age=20;
		weight=11;
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("not eligible :under weight");
			}
		
		}
		else
	{
			System.out.println("not eligible");
	}

}
}