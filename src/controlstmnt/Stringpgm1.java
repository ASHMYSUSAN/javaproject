package controlstmnt;

public class Stringpgm1 {

	public static void main(String[] args) {
		
		//contains platform or not in s
String s=" java is platform independent language";
if(s.contains("platform"))
{
	System.out.println("contain platform");
}
else
{
	System.out.println("doesnot contain platform");
}



// splitting
String s1="jmeter is performance testing tool";
String[] str=s1.split("");
for(String v:str)
{
	System.out.println(v);
	
}
	}

}
