package basics;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String a[]=new String[4];
		
		System.out.println("Enter your Name");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.next();

		}
		
		System.out.println("Enterd Names are:");
		
		
		for(String s:a) // For Each Loop (datatype Tempvariable : Array Name)
			
		System.out.println(s);
		
	}

}
