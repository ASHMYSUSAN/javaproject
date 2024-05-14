package oops;

import java.util.Scanner;

interface bank
{
	public void account();
	public void balance();
	public void deposit();
	public void withdrawal();
	
}

class sbi implements bank
{

Scanner sc=new Scanner(System.in);

long  balance=10000;
long deposit;
long withdrawal;



	@Override
	public void account() {
		System.out.println("name=");
		String name=sc.next();
		System.out.println("accountnumber=");
        long accountnumber=sc.nextLong();
		System.out.println("ifsc=");
		String ifsc=sc.next();
		System.out.println("branch=");
		String branch=sc.next();
	}

	@Override
	public void balance() {
System.out.println("balance="+balance);		
	}

	@Override
	public void deposit() {
System.out.println("enter Deposit:");		
int deposit=sc.nextInt();
balance=balance+deposit;
System.out.println("balance after depost="+balance);
	}

	@Override
	public void withdrawal() {
System.out.println("enter amount to withdraw:");	
int withdrawal=sc.nextInt();
if(balance<withdrawal)
{
	System.out.println("insufficient amount");
}
else
{
	balance=balance-withdrawal;
	System.out.println("new balance after withdrawal="+balance);
}
	}			
}
public class Bnakapplication {

	public static void main(String[] args) {
		
		sbi ob=new sbi();
		ob.account();
		ob.balance();
		ob.deposit();
		ob.withdrawal();
		
		int choice;
		Scanner ch=new Scanner(System.in);
		System.out.println("1.account details  2.balance  3.deposit  4.withdrawal");
		System.out.println("enter choice");
		choice=ch.nextInt();
		switch(choice)
		{
		case 1:ob.account();
		break;
		case 2:ob.balance();
		break;
		case 3:ob.deposit();
		break;
		case 4:ob.withdrawal();
		break;
		default:System.out.println("invalid choice");
		}

	}

}
