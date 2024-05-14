package controlstmnt;

public class Calculator {

	public static void main(String[] args) {
		int a=20,b=30;
		int ch;
		
	ch=4;
	switch(ch)
	{
	case 1:System.out.println("addition");
	System.out.println(a+b);
	break;
	case 2:System.out.println("subtraction");
	System.out.println(a-b);
	break;
	case 3:System.out.println("multiplication");
	System.out.println(a*b);
	break;
	case 4:System.out.println("division");
	System.out.println(a/b);
	break;
	default:System.out.println("invalid choice");
	}

}
}
