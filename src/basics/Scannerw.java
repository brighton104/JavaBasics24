package basics;

import java.util.Scanner;

public class Scannerw {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);      //util package import
		
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		
		System.out.println("Enter your Name");
		String name=sc.next();
		
		System.out.println("Enter a Character");
		char c=sc.next().charAt(1);
		


	}

}
