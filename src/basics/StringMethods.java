package basics;

public class StringMethods {

	public static void main(String[] args) {

	//Length of the String	
		String s="Welcome";
		//System.out.println(s.length());
		int l=s.length();
		System.out.println(l);
		
	//Join Two String
		String s1="hello";
		String s2="World";
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1);
		System.out.println(s1+1+2);
		
	//Lower case/Upper case
		String s3="Brighton123";
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
	//Compare
		String a="Abc";
		String b="abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
	//Trim White space
		String  s4="   hello A";
		System.out.println(s4);
		System.out.println(s4.trim());
		
	//Substring
		String y="welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(1, 4));
		
	//Contains
		String x="Welcome to Brighton World";
		System.out.println(x.contains("brighton"));
		System.out.println(x.contains("Brighton"));
		
	//replace
		System.out.println(x.replace("We", "xy"));
		
	//Extract value
		String z="Welcome";
		System.out.println(z.charAt(4));
		
	//Split the string
		String w="Welcome to Brighton World";
		String word[]=w.split(" ");
		for(String le:word)
		{
			System.out.println(le);
		}
		
	//Split character
		String d="hello";
		char cha[]=d.toCharArray();
		for(char len:cha)
		{
		System.out.println(len);
		}
		
		
		
		
		
		
	
		
		
	}

}
