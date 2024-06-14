package oops;

public class AbstractClass {

	public static void main(String[] args) {
		SearchAll sa=new SearchAll();
		sa.display();
		sa.message();
		
		SearchImage si=new SearchImage();
		si.display();
		si.message();
		
		SearchVideo sv=new SearchVideo();
		sv.display();
		sv.message();
	
		System.out.println("Value of A ="+Google.a);
	}

}

//Abstract class create
abstract class Google  {
	
	static int a=10;
	
	abstract void display(); //Abstract method
	
	public void message() //Normal method
	{
		System.out.println("Message.........");
	}
}

//Child class
class SearchAll extends Google{

	@Override
	void display() {
		System.out.println("Search All From Google");
		
	}
	
}

class SearchImage extends Google{

	@Override
	void display() {
		System.out.println("Search Image from Goolgle");
		
	}
	
}

class SearchVideo extends Google{

	@Override
	void display() {
		System.out.println("Search Video From Google");
		
	}
	
}