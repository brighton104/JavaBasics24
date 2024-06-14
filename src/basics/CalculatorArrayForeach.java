package basics;

import java.util.Scanner;

public class CalculatorArrayForeach {

	public static void main(String[] args) {

		int a[]=new int[2];
		int output[]=new int[1];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		for (int i=0;i<2;i++)
		{
		a[i]=sc.nextInt();

		}
		
		System.out.println("enter your options 1. Addition 2. Substration 3. Multiplication 4. Division");
		for (int j=0;j<1;j++)
		{
		output[j]=sc.nextInt();
		
		switch(output[j])
		{
		case 1:
		for (int i=0;i<1;i++)
		{
		a[i]=a[0]+a[1];
		System.out.println("Added value = "+a[i]);
		}
		break;
		case 2:
		for (int i=0;i<1;i++)
		{
		a[i]=a[0]-a[1];
		System.out.println("Subtracted Value = "+a[i]);
		}
		break;
		case 3:
		for (int i=0;i<1;i++)
		{
		a[i]=a[0]*a[1];
		System.out.println("Multiplied value = "+a[i]);
		}
		break;
		case 4:
		for (int i=0;i<1;i++)
		{
		a[i]=a[0]/a[1];
		System.out.println("Divided value = "+a[i]);		
		}
		break;
		default:
		{
		System.out.println("Default value");		
		}
		}
		}
	}
}


