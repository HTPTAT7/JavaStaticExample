package by.htp.bean;

public class Employee {
	
	private static double k = 1;
	private int salary;
	
	
	public Employee(int salary){
		this.salary = (int) (salary * k);
	}

	public void increaseSalary(){
		salary = (int) (salary * k);
	}
	
	public static void setK(double newK){
		k = newK;
	}
	
	public static double getK(){
		return k;
	}
	
	public int getSalary(){
		return this.salary;
	}
}
