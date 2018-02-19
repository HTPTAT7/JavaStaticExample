package by.htp.bean;

public class A {
	static{
		System.out.println("AS1");
	}
	
	public A(){
		this("a");
		System.out.println("A ()");
	}

	public A(String str){
		System.out.println("A "
				+ "(str)");
	}
	
	public A(int a){
		this();
		System.out.println("A "
				+ "(int)");
	}

	{
		System.out.println("AL1");
	}
}