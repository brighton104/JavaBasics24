package basics;

public class ReverseNumber {

	public static void main(String[] args) {

		int n=23456,rev=0;
		while (n!=0)
		{
			int remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
			
		}
		
		System.out.println("The Reverse number is "+rev);
		
	}

}
