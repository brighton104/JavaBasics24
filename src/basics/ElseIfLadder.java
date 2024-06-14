package basics;

public class ElseIfLadder {

	public static void main(String[] args) {

		int age=19;
		
		if (age>=18 && age<50)
		{
			
			System.out.println("Major");
		}
		else if(age<18)
		{
			System.out.println("Minor");
		}
		else if(age>60)
		{
			System.out.println("Retired");
		}
		
		else
		{
			System.out.println("Invalid");
		}
		
		
	}

}
