package lists.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args)
	{
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Nishant","Singh",19));
		employeeList.add(new Employee("Rishu","Tiwari",20));
		employeeList.add(new Employee("Naman","Rana",19));
		employeeList.add(new Employee("Nitin","Singh",24));
		
		employeeList.remove(employeeList.get(3));
		
		employeeList.add(2,new Employee("Nishu","Singh",20));
		
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee emp:employeeArray)
			System.out.println(emp);
		
		System.out.println(employeeList.contains(new Employee("Naman","Rana",19)));
	}
}
