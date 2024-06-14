package oops;

public class ExcepionFinally {

	public static void main(String[] args) {
		
	System.out.println("Started");
		
		try
		{
		int a=10;
		System.out.println(a);
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		finally
		{
			System.out.println("This is Finally");
		}
		
	System.out.println("Stopped");
	}

}
