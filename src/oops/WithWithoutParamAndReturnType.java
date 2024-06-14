package oops;

public class WithWithoutParamAndReturnType {

	public static void main(String[] args) {
	
		WithWithoutParamAndReturnType m=new WithWithoutParamAndReturnType();
		m.rectangleArea();
		System.out.println("Area of a Square = "+m.squareArea(5));
		System.out.println("Area of a triangle ="+m.triangleArea());
		m.circleArea(5);
	}
//Area of rectangle	
	public void rectangleArea()
	{
		int l=10,b=20;
		int a=l*b;
		System.out.println("Area of a rectangle ="+a);
	}

//Area of a Square	
	public int squareArea(int a)
	{
		int c=a*a;
		return c;
		
	}

//Area of a Triangle
	public float triangleArea()
	{
		int b=10;
		int h=50;
		float a=0.5f*b*h;
		return a;
	}
	
//Area of a Circle
	public void circleArea(int r)
	{
		float p=3.14f;
		float a=p*r*r;
		System.out.println("Area of a Circle ="+a);
		
	}
	
	
}
