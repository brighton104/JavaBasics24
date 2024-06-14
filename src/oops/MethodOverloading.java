package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading ol=new MethodOverloading();
		ol.add(10, 20);
		ol.add(20, 30, 10);

	}
	
//Method OverLoading:- Having same method name and different arguments
	
//Same Name different argument
	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
			
	}

}


