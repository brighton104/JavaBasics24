package oops;

public class MethodOverloding2 {

	public static void main(String[] args) {
		
		MethodOverloding2 ol2=new MethodOverloding2();
		ol2.add(20, 10.20);
		ol2.add(5, 4);
	}

	
//Same name but different data type in argument
	
	public void add(int a, double b)
	{
		double c= a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b)
	{
		int d=a+b;
		System.out.println(d);
			
	}

}
