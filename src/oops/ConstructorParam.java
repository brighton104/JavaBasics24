package oops;

public class ConstructorParam {

	public static void main(String[] args) {
		ConstructorParam c=new ConstructorParam(5,15000,"QA");
		
		System.out.println("EmpId ="+c.employeeid);
		System.out.println("Salary ="+c.salary);
		System.out.println("Designation ="+c.designation);

	}
	
	int employeeid,salary;
	String designation;
	
	public ConstructorParam(int id,int sal, String des )
	{
		
		employeeid=id;
		salary=sal;
		designation=des;
	}
	
}
