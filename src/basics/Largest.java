package basics;

public class Largest {

	public static void main(String[] args) {
		int a=20,b=30,c=10;
		
		if(a>=b && a>=c)
		{
			System.out.println("The largest number is "+a);
		}

		else if(b>=a && b>=c)
		{
			System.out.println("The largest number is "+b);
			
		}
		else 
		{
			System.out.println("The largest number is "+c);
		}
		}
		
	}

