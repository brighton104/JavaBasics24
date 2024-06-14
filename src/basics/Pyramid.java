package basics;

public class Pyramid {

	public static void main(String[] args) {
		
//Triangle shape print "*"	
		
		for(int a=1;a<=5;a++)
		{
			
			
			for(int b=1;b<=a;b++) 
			{
				System.out.print(" * ");
			}
		System.out.println();
	}
		
		
	
//Triangle shape print "1, 12, 123"	

		for(int c=1;c<=5;c++)
		{
			
			
			for(int d=1;d<=c;d++) 
			{
				System.out.print(d+ " ");
			}
		System.out.println();
	}		
		
		

		
System.out.println();
	
// 1 to 10 number in triangle shape
		int n=1;
		for(int c=1;c<=4;c++)
		{
			
			
			for(int d=1;d<=c;d++) 
			{
				System.out.print(n+ " ");
				n++;
			}
		System.out.println();
	}

	}

}
