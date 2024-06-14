package basics;

public class CalculatorSwith {

	public static void main(String[] args) {

		
		int a=20,b=2;
		int output=1;
		
		switch(output)
		{
		case 1:
		output=a+b;
		System.out.println("Addition ="+output);
		break;
		case 2:
		output=a-b;
		System.out.println("Substration ="+output);
		break;
		case 3:
		output=a*b;
		System.out.println("Multiplication ="+output);
		break;
		case 4:
		output=a/b;
		System.out.println("Division =" +output);
		break;
		default:
		output=a%b;
		System.out.println("Modulus= "+output);
	}
		
	}

}
