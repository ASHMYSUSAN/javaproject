package controlstmnt;

public class Countofoddeven {

	public static void main(String[] args) {

int oddcount=0,evencount=0;
for(int i=1;i<=100;i++)
{

	if(i%2==0)
	{
evencount++;	}

else
{
	oddcount++;
}}
	System.out.println("evencount="+evencount);
	System.out.println("oddcount="+oddcount);

	}
}