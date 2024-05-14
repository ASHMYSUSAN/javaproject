package controlstmnt;


public class Reversestring {

	public static void main(String[] args) {

String s="welcome to luminar";
String[] str=s.split(" ");
for(int i=str.length-1;i>=0;i--)
{
	System.out.println(str[i]);
}
	}

}
