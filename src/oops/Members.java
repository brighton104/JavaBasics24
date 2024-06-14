package oops;

public class Members {
	public static void main(String[] args) {

		Worker w=new Worker();
		w.name="Brighton";
		w.age=30;
		w.address="Thrissur";
		w.salary=12000;
		w.specialization="Software Tester";
		w.printDetails();
		System.out.println("Specialization =" +w.specialization);
		
		Manager m=new Manager();
		m.name="Arun";
		m.age=29;
		m.address="Thrissur";
		m.salary=15000;
		m.department="QA";
		m.printDetails();
		System.out.println("Department =" +m.department);
	}

}	
class MemberDetails
{

	String name,address;
	int age,salary;
	
	void printDetails()
	{
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
		System.out.println("Address ="+address);
		System.out.println("Salary ="+salary);
	}
	
}
class Worker extends MemberDetails
	{
	
	String specialization;
		
	}

class Manager extends MemberDetails
	{
	String department;
	}

