package oops;

public class MethodOverriding {

	public static void main(String[] args) {
		
	B b=new B();
	b.m1();
	
	}
}
class A
{
	void m1()
	{
		int a=10;
		System.out.println(a);
	}
	
}
	
class B extends A
{
	void m1()
	{
		int a=20;
		super.m1();
		System.out.println(a);
		//To access the parent class method we use super keyword
		
	}

}
	
	
