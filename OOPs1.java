//Constructors
class Student{
	int rn;
	String name;
	String subject;
	static final String instituteName = "APSMind";
	Student(){
		System.out.println("I am default constructor.");
	}
	Student(int rn,String name){
		System.out.println("I am parametrized(2) constructor.");
		this.rn = rn;
		this.name = name;
	}
	Student(int rn,String name,String subject){
		this(rn,name);
		System.out.println("I am parametrized(3) constructor.");
		this.subject = subject;
	}
	public void showStudent(){
		System.out.println(rn);
		System.out.println(name);
		System.out.println(subject);
		System.out.println(instituteName);
	}
}

class Simple{
	public static void main(String[] args){
		Student s = new Student(1,"Ramu Kaka");	
		//s.instituteName = "ABCDEFG";
		s.showStudent();
		
		Student s2 = new Student(2,"ABCX","Java");
		s2.showStudent();
	}
}