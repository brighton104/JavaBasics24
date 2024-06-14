package basics;

import java.util.Scanner;

public class ForEachTwoArray {

	public static void main(String[] args) {

		int a[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Entred values are");
		for(int b[]:a)
		{
			for(int tv:b)
			{
				System.out.print(tv+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
