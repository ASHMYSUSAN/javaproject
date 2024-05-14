package controlstmnt;

public class Palindrome {

	public static void main(String[] args) {
int n=151,temp,reverse=0,remainder;
temp=n;
while(n>0)
{
	remainder=n%10;
	reverse=(reverse*10)+remainder;
	n=n/10;
}
if(temp==reverse)
{
	System.out.println("number is palindrome");
}
else
{
	System.out.println("not palindrome");
}
	}

}
