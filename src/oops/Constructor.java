package oops;

public class Constructor {

	public static void main(String[] args) {
		Constructor c=new Constructor();
		
		System.out.println("EmpId ="+c.employeeid);
		System.out.println("Salary ="+c.salary);
		System.out.println("Designation =" +c.designation);

	}
	
	int employeeid,salary;
	String designation;
	
	public Constructor()
	{
		employeeid=5;
		salary=15000;
		designation="QA";
		
	}

	
	
	
}
