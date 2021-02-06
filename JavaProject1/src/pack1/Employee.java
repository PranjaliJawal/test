package pack1;

import java.util.ArrayList;

//interface
interface EmployeeDetails{
	void display();
}
 
public class Employee implements  EmployeeDetails{
	
	
	@Override
	public void display() {
		System.out.println("Hellooooo");
		
	}

	public static void main(String[] args) {
		//class object
		Employee e1=new Employee();
		e1.display();
		
		
		//collection
		ArrayList list=new ArrayList();
		list.add("Pranjali");
		list.add(8010);
		System.out.println(list);
		
		//string
		String s1="welcome";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.toUpperCase());
		
		
		
		
		
		
		
	

	}

	

	
}
