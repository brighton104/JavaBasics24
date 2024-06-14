package Programs;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int num=29;
		boolean f=false;
		
		for (int i=2;i<num/2;i++) 
		{
			if (num % i==0)
			{
				f=true;
				break;
			}
		}

		if(!f)
		System.out.println(num+" is a Prime Number");
		else
		System.out.println(num+" is not a Prime Number");
		
	}

}
