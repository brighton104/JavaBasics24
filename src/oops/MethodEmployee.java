package oops;

public class MethodEmployee {

	public static void main(String[] args) {
		
		MethodEmployee emp=new MethodEmployee();
			emp.dept="Software Testing";
			emp.empid=05;
			emp.empname="Brighton M S";
			emp.salary=5000;
			emp.display();
			System.out.println("Company = "+company);
	}
	
	//instance variable
	int empid,salary;
	String empname,dept;
	
	//Static variable
	static String company="Abc Company";
	
	public void display()
	{
	//Local Variable
		//int deprt;
		System.out.println("EmpID = "+empid);
		System.out.println("Dept = "+dept);
		System.out.println("Emp Name = "+empname);
		System.out.println("Salary= "+salary);
	}
	

}
