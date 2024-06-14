package oops;

public class SingleInheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.eating();
		c.sleeping();

	}

}


 class Dog{
	
	 public void eating()
	 {
		System.out.println("Dog is Eating"); 
	 }
	 
}
 
class Cat extends Dog{
	public void sleeping()
	{
		System.out.println("Cat is Sleeping");
	}
	
}
