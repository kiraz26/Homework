package homework;

public class Student {
	
	String name;
	String lastName;
	double weight;
	double height;
	int age;
	
	public String getStudentInfo(String name, String lastName) {
		String studentInfo=name+" "+lastName;
		return studentInfo;	
	}
	public void giveWeight() {
		double stuWeight=weight;
		System.out.println(name+"'s weight="+stuWeight);
	}
	
}
