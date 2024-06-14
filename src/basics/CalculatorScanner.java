package basics;

import java.util.Scanner;

public class CalculatorScanner {

	public static void main(String[] args) {

		int a,b,r;
		char op;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		a=sc.nextInt();		
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		System.out.println("Select the operator +, -, *, /");
		op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+':
			r=a+b;
			System.out.println(r);
			break;
		case '-':
			r=a-b;
			System.out.println(r);
			break;
		case '*':
			r=a*b;
			System.out.println(r);
			break;
		case '/':
			r=a/b;
			System.out.println(r);
			break;
		default:
			System.out.println("Default value");		
		}
		
		
	}

}
