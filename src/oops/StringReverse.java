package oops;

public class StringReverse {

	public static void main(String[] args) {
		  String s = "Hello";
		    String reversed = "";
		    System.out.println("Original string: " + s);
		        
		    for (int i = 0; i < s.length(); i++) {
		    	reversed = s.charAt(i) + reversed;
		    }
		    
		    System.out.println("Reversed string: "+ reversed);
		  }
}
