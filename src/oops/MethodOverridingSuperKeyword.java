package oops;

public class MethodOverridingSuperKeyword {

	public static void main(String[] args) {
		Bmw b=new Bmw();
		b.speed();
		b.power();

	}
	
//Method Overriding:- Having different class with same method name

}

class Car
{
	void speed()
	{
		System.out.println("Car Speed");
	}
	
	void power()
	{
		System.out.println("Car Power");
	}
}

class Bmw extends Car
{

	@Override
	void speed() {
		System.out.println("BMW Speed");
		super.speed();
	}

	@Override
	void power() {
		System.out.println("BMW Power");
		super.power();
	}
	
}