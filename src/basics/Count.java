package basics;

public class Count {

	public static void main(String[] args) {
	
		int n=1234,count=0;
		
		while (n>0)
		{
		
			n=n/10;
			count++;
		}
		
		System.out.println(count);

		
		

	}

}
