package Programs;

public class Student {

	public static void main(String[] args) {
	
		Teacher t=new Teacher();
		t.mark();
		t.showDetails();
		t.department();
		t.resign();
		t.rejoin();

	}
}

interface Principle{
	void resign();
	void rejoin();
}

class Students{
	
	void mark()

	{
		System.out.println("Student Mark");
	}
	
	void showDetails()
	{
		System.out.println("Show Details");
	}
}

class Teacher extends Students implements Principle{

	@Override
	public void resign() {
		System.out.println("Resign ");
		
	}

	@Override
	public void rejoin() {
	System.out.println("Rejoin");		
	}
	
	void department()
	{
		System.out.println("Department");
	}
}