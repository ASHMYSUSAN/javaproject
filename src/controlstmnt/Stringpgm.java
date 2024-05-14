package controlstmnt;

public class Stringpgm {

	public static void main(String[] args) {
//concat
		String s="hello welcome to luminar";
		String s1="welcome";
		String s2="   Hello   ";
		String s3="Hello luminar";
		System.out.println(s.concat(s1));
		System.out.println(3+2+s+5+6);
	

	//equals
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s3));
		
		//contains
		System.out.println(s.contains("luminar"));

		//tolower case and toupper case
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//start with and ends with
		System.out.println(s.startsWith("hello"));
		System.out.println(s.endsWith("luminar"));
		
		//trim
		System.out.println(s2.trim());
		
		//length
		System.out.println(s1.length());
		
		//charAt
		
		System.out.println(s1.charAt(3));
		
		//substring
		
		System.out.println(s.substring(1,3));
		
		//split
		
		String[] str=s.split("");
		for(String v:str)
		{
			System.out.println(v);
			
		}
		
		
		//replace
		
		System.out.println(s.replace("hello", "hi"));
		
		//tochararray
		
		char[] ch=s1.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		

}
}