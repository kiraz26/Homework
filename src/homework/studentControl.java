package homework;



public class studentControl {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="Mike";
		s1.lastName="Brown";
		s1.age=28;
		s1.weight=179.9;
		s1.height=165;
		
		Student s2=new Student();
		s2.name="Ricky";
		s2.lastName="Remark";
		s2.age=28;
		s2.weight=176.9;
		s2.height=175;
		
		
		String s1Info=s1.getStudentInfo("Mike", "Brown");
		System.out.println(s1Info);
		s1.giveWeight();
		
		String s2Info=s2.getStudentInfo("Ricky", "Remark");
		System.out.println(s2Info);
		s2.giveWeight();
		
	}

}
