package oops;

public class Mammals {

	public static void main(String[] args) {
		
	Human h=new Human();
	h.jump();
	h.bite();
	h.speak();
	h.sleep();
	h.cat();

	}

}


class Monkey{
	public void jump()
	{
		System.out.println("Jumping");
	}
	
	public void bite()
	{
		System.out.println("Biting");
	}
}


interface BasicAmimal{
	
	void sleep();
	void cat();
}


class Human extends Monkey implements BasicAmimal{
	public void speak()
	{
		System.out.println("Speaking");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
		
	}

	@Override
	public void cat() {
		System.out.println("Cat");
		
	}
}


