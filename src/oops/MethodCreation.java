package oops;

public class MethodCreation {

	public static void main(String[] args) {
		
		MethodCreation m=new MethodCreation();
		m.sum();
		System.out.println("sub ="+m.sub(20, 5));
		System.out.println("Mul ="+m.mul());
		m.div(50, 5);
	}

//Method Without Parameter and Without Return Type
	public void sum()
	{
		int a=10,b=30;
		int c=a+b;
		System.out.println("Sum ="+c);	
	}

	
//Method With Parameter and With Return Type
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}

	
//Method Without Parameter and With Return Type
	public int mul()
	{
		int a=10, b=5;
		int c=a*b;
		return c;
	}
//Method With Parameter and Without Return Type
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Div ="+c);
	}
	


}
