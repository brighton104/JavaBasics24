package basics;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {

		int a[][]=new int[3][2];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the values");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
			a[i][j]=sc.nextInt();
			}
				
		}
		
		System.out.println("Values are");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		
		System.out.println();
		
	}

}
}