package lists.Vector;

import java.util.List;
import java.util.Vector;

public class App {

	public static void main(String[] args)
	{
		List<Student> studentList = new Vector<>();
		studentList.add(new Student("Nishant","Singh",19));
		studentList.add(new Student("Satin","Kumar",25));
		studentList.add(new Student("Nitin","Singh",24));
		studentList.add(new Student("Srishti","Singh",22));
		
		for(Student st:studentList)
			System.out.println(st);
	}
}
