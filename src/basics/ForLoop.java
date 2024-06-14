package basics;

public class ForLoop {

	public static void main(String[] args) {
		
	
	//Print 1 to 10	
		System.out.println("Print 1 to 10 ");

		for(int a=1;a<=10;a++)
		{
		System.out.println(a);

		}
		
	//Reverse 
		
		System.out.println("Reverse of 10 to 1");
		
		for(int b=10;b>=1;b--)
		{
			System.out.println(b);
		}
		
		
	//Multiplication table
		System.out.println("Print multiplication table of 5");

		for(int a=1;a<=10;a++)
		{
		System.out.println(a+"*5 ="+a*5);
		//int c=5;
        // System.out.printf("%d * %d = %d \n", a, c, c*a);

		}
		
	}

}
