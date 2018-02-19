package by.htp.bean;

public class SuperEmployee {
	
	private double k = 1;
	private int salary;
	
	
	public SuperEmployee(int salary){
		this.salary = (int) (salary * k);
	}

	public void increaseSalary(){
		salary = (int) (salary * k);
	}
	
	public void setK(double newK){
		k = newK;
	}
	
	public double getK(){
		return k;
	}
	
	public int getSalary(){
		return this.salary;
	}
}
