package oops;

public class MultipleInheritance {

	public static void main(String[] args) {
		ICICI obj=new ICICI();
		
		obj.deposit();
		obj.withdraw();
		obj.interest();
		obj.balance();

	}

}

interface Bank1
{
	void deposit();
	void withdraw();
	
}

interface Bank2
{
	void interest();
	void balance();
	
}

class ICICI implements Bank1,Bank2
{

	@Override
	public void interest() {
		System.out.println("Interest Rate");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance Amount");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit Amount");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw Amount");
		
	}
	
}