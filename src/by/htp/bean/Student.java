package by.htp.bean;

public class Student {
	
	private static String group;
	private int avgMark;
	
	public Student(){
		
	}

	public static String getGroup() {
		return group;
	}

	public static void setGroup(String group) {
		Student.group = group;
	}

	public int getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(int avgMark) {
		this.avgMark = avgMark;
	}

	
}
