package oops;

public class Encapsulation {

	public static void main(String[] args) {
		
		Encap e=new Encap();
		e.setName("Brighton");
		System.out.println(e.getName());
		
		e.setDesignation("Tester");
		System.out.println(e.getDesignation());
	}
	
}


class Encap
{
	
	private String name;
	private String designation;
	
	//right click and generate getter and setter method 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}	
	
}
