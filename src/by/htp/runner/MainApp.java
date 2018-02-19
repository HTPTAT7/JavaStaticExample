package by.htp.runner;

import by.htp.bean.Employee;
import by.htp.bean.Student;
import by.htp.bean.SuperEmployee;

public class MainApp {

	public static void main(String[] args) {

		Employee emp1 = new Employee(100);
		System.out.println("emp1 start salary: " + emp1.getSalary());
		Employee emp2 = new Employee(100);
		System.out.println("emp2 start salary: " + emp2.getSalary());
		
		Employee.setK(1.5);
		emp1.increaseSalary();
		System.out.println("emp1 half year salary: " + emp1.getSalary());
		emp2.increaseSalary();
		System.out.println("emp2 half year salary: " + emp2.getSalary());
		
		Employee emp3 = new Employee(100);
		System.out.println("emp3 start salary: " + emp3.getSalary());
		Employee emp4 = new Employee(100);
		System.out.println("emp4 start salary: " + emp4.getSalary());
		
		System.out.println("-----------------------");
		
		SuperEmployee se1 = new SuperEmployee(100);
		System.out.println("se1 start salary: " + se1.getSalary());
		
		se1.setK(2);
		se1.increaseSalary();
		System.out.println("se1 half year salary: " + se1.getSalary());
		
		SuperEmployee se2 = new SuperEmployee(100);
		System.out.println("se2 start salary: " + se2.getSalary());
		
		System.out.println("====================");
		
		Student st1 = new Student();
		st1.setAvgMark(10);
		Student.setGroup("Java group");
		
		Student st2 = new Student();
		st2.setAvgMark(8);
		//st2.setGroup("C++ group");
		
		Student st3 = new Student();
		st3.setAvgMark(9);
		//st3.setGroup("C-- group");
		
		Student st4 = new Student();
		st4.setAvgMark(3);
		//st4.setGroup("C# group");
		
		System.out.println("st1 group: " + st1.getGroup());
		System.out.println("st1 mark: " + st1.getAvgMark());
		System.out.println("_______");
		
		System.out.println("st2 group: " + st2.getGroup());
		System.out.println("st2 mark: " + st2.getAvgMark());
		System.out.println("_______");
		
		System.out.println("st3 group: " + st3.getGroup());
		System.out.println("st3 mark: " + st3.getAvgMark());
		System.out.println("_______");
		
		System.out.println("st4 group: " + st4.getGroup());
		System.out.println("st4 mark: " + st4.getAvgMark());
		System.out.println("_______");
		
		
		Student.setGroup("Number One!");
		
		
		Student st5 = new Student();
		System.out.println("st5 group: " + st5.getGroup());
	}

}
