package oops;

import java.util.Scanner;

interface petshop
{
	public void fish();
	public void cat();
	public void dog();
	
}
class purchase implements petshop
{
	Scanner sc=new Scanner(System.in);

	@Override
	public void fish() {
		String fname="betta, barbs, goldfish";
		String colour="blue, yellow, golden";
		int stockquantity=150;
		int price=50;
		System.out.println("stock details of fish="+fname+"available colour="+colour+"available stock(in number) "+stockquantity);
		System.out.println("enter name of fish");
		String name=sc.next();
	     System.out.println("enter the quantity of fish needed");
	int quantity=sc.nextInt();
	System.out.println("enter colour");
	String color=sc.next();
	if(quantity>stockquantity)
	{
		System.out.println("out of stock");
	}
	else
	{
		System.out.println("Total amount="+quantity*price);
	}
	}

	@Override
	public void cat() {
		String cname="persian cat, turkish van ,birman";
		String colour="brown,white,black";
		int stockquantity=10;
		int price=5000;
		System.out.println("stock details of cat="+cname+"available colour="+colour+"available stock(in number) "+stockquantity);
		System.out.println("enter name of cat");
		String name=sc.next();
	     System.out.println("enter quantity");
	int quantity=sc.nextInt();
	System.out.println("enter colour");
	
	String color=sc.next();
	
	if(quantity>stockquantity)
	{
		System.out.println("out of stock");
	}
	else
	{
		System.out.println("Total amount="+quantity*price);
	}	
	}

	@Override
	public void dog() {
		String dname="german shephered, bulldog ,labrador";
		String colour="brown,white,black";
		int stockquantity=10;
		int price=10000;
		System.out.println("stock details of dog="+dname+"available colour="+colour+"available stock(in number) "+stockquantity);
		System.out.println("enter name of dog");
		String name=sc.next();
	     System.out.println("enter quantity");
	    int quantity=sc.nextInt();
	System.out.println("enter colour");
	String color=sc.next();
	if(quantity>stockquantity)
	{
		System.out.println("out of stock");
	}
	else
	{
		System.out.println("Total amount="+quantity*price);
	}	
		}
	}

public class Petapplication {
public static void main(String[] args) {
		purchase ob=new purchase();
	       Scanner sc=new Scanner(System.in);
		System.out.println(" enter choice 1. buy fish, 2.buy cat, 3. buy dog");
		int choice=sc.nextInt();
			
		switch(choice)

		{
			case 1:ob.fish();
			break;
			case 2:ob.cat();
			break;
			case 3:ob.dog();
			break;
			default:System.out.println("Invalid choice");
		}
		
		
		System.out.println("Enter 1 to confirm purchase and 2 to exit");
		
		
		int value=sc.nextInt();
		
		switch(value)

		{
			case 1:System.out.println("Thank You for the Purchase");
			break;
			default:System.out.println("exit");
		}
		System.out.println(" ");
		

	}

}
