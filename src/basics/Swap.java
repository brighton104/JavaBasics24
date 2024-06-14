package basics;

public class Swap {

	public static void main(String[] args) {

		int a=25,b=23;
		int c=a;
		a=b;
		b=c;
		{
		System.out.println("With Variable");
		System.out.println("print a=" +a);
		System.out.println("print b=" +b);	
		}
		
		int x=10,y=30;
		x = x + y;   
	    y = x - y;   
	    x = x - y;  
	    {
		System.out.println("Without Variable");
	    System.out.println("print x=" +x);
		System.out.println("print y=" +y);	
		}
	    
		
	}

}

