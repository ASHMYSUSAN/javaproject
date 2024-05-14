package controlstmnt;

public class Totalchara {

	public static void main(String[] args) {
		 int count = 0;   
		String str = "welcome to luminar";         
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
            
         
        System.out.println("Total number of characters in a string: " + count);    
}


	}


