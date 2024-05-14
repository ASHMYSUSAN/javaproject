package controlstmnt;

public class Reversenum {

	public static void main(String[] args) {
int n=2768,reverse=0;
while(n!=0)
{
int remainder=n%10;
reverse=reverse*10+remainder;
n=n/10;
	}
System.out.println("reverse of number="+reverse);
}
}