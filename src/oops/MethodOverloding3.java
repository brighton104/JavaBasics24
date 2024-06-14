package oops;

public class MethodOverloding3 {

	public static void main(String[] args) {

		MethodOverloding3 ov3=new MethodOverloding3();
		ov3.add(50, 50.10);
		ov3.add(20.10, 30);
		
	}
	
	
// Same Method name but oder of argument or parameter is changed
	
	public void add(int a,double b)
	{
		double d= a+b;
		System.out.println(d);
	}
	
	public void add(double b, int a)
	{
		double d= a+b;
		System.out.println(d);
	}
				
}



