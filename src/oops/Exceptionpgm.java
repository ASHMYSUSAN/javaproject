package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		
	//----------file not found exception-----	
		
	FileInputStream f=new FileInputStream("E://text.xlsx");
		
		
//------arithematic exception-----
		try {
		int a=22,b=0;
		double c=a/b;
		System.out.println(c);
	}
catch(Exception e)
		{
	System.out.println(e.getMessage());
		}
System.out.println("welcome luminar");

//------null point exception--------
try {
	

String s=null;
System.out.println(s.length());


}
catch(Exception e)
{
	System.out.println("nullpointexception");
	System.out.println(e.getMessage());
}


}}