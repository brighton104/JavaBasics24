package oops;

public class MultiLevelInheritance {

	public static void main(String[] args) {

		Lion l=new Lion();
		l.eating();
		l.sleeping();
		l.running();
	}

}


class Dogs{
	
	 public void eating()
	 {
		System.out.println("Dog is Eating"); 
	 }
	 
}

class Cats extends Dogs{
	public void sleeping()
	{
		System.out.println("Cat is Sleeping");
	}
	
}

class Lion extends Cats{
	
	public void running() 
	{
		System.out.println("Lion is Running");
	}
}



