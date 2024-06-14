package oops;

public class VariablesInilizationThis {
		int employeeid;
		int salary;
		String designation;
		
	//this Keyword
		public void setvalues(int empid,int sal,String desgn)
		{
			this.employeeid=empid;
			this.salary=sal;
			this.designation=desgn;
		}
		
		/*public void setvalues(int empid,int sal,String desgn)
		{
			employeeid=empid;
			salary=sal;
			designation=desgn;
		}*/
	
		public void display()
		{
			
			System.out.println("EmpId ="+employeeid);
			System.out.println("Salary ="+salary);
			System.out.println("designation =" +designation);
		}
		
		

		public static void main(String[] args) {
			
			VariablesInilizationThis v=new VariablesInilizationThis();
			v.setvalues(5, 15000, "Developer");
			v.display();
			
		}
		
	}


