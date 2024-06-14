package basics;

public class NestedIf {

	public static void main(String[] args) {
		int age=20,weight=50;
		if (age>=18)
				{
				if (weight<51)
				{
					System.out.println("Elegible");
				}
				else
				{
					System.out.println("Ineligible weight");
					}
				}
		else
		{
			System.out.println("Not eligible ");
		}

	}

}
