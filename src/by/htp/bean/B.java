package by.htp.bean;

public class B extends A {

	static {
		new B();
		System.out.println("BS1");
	}

	{
		System.out.println("BL1");
	}

	public B() {
		this(123456);
		System.out.println("B ()");
	}

	public B(int b) {
		super(b);
		System.out.println("B (b)");
	}

	{
		System.out.println("BL2");
	}
	
}
