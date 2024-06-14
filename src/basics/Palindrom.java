package basics;

public class Palindrom {

	public static void main(String[] args) {

		int num=121,r=0,temp;
		temp=num;
		while (num!=0)
		{
			int remainder=num % 10;
			r=r * 10 + remainder;
			num=num / 10;
			
		}
		
		System.out.println("The Reverse number is "+r);
		 if(temp==r)    
		 {
			   System.out.println("palindrome number ");    
		 }
			  else  
			  {
			   System.out.println("not palindrome");    
		 }
	}

}
