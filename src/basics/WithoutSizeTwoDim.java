package basics;

public class WithoutSizeTwoDim {

	public static void main(String[] args) {

		int a[][]={{10,20},{30,40},{50,60}};
		
		for(int i[]:a)
		{
			for(int tv:i)
			{
				System.out.print(tv+" ");
			}
			System.out.println();
		}
		
		
	}

}
