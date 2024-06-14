package basics;

import java.util.Scanner;

public class OneDimenArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		
		System.out.println("Enter your Number");
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();

		}
		
		System.out.println("Enterd Values are:");
	
		for(int i=0;i<6;i++)
		System.out.println(a[i]);
		
		
		
	}

}
