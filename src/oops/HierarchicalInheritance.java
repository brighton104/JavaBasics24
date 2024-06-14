package oops;

public class HierarchicalInheritance {

	public static void main(String[] args) {
 
		Sbi s=new Sbi();
		s.deposit();
		s.withdraw();
		s.sbiInsurance();
		
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdraw();
		h.hdcLoan();
	}

}



class Bank{
	
	public void deposit()
	{
		System.out.println("Deposit");
	}
	
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	
}


class Sbi extends Bank{
	
	public void sbiInsurance()
	{
		System.out.println("SBI Insurance");
	}
}


class Hdfc extends Bank{
	
	public void hdcLoan()
	{
		System.out.println("HDFC Loan");
	}
}