class Human{
	String name;
	int age;
	char gender;
	static int humanCount = 0;
	public Human(){
		this.name = null;
		this.age = 0;
		humanCount++;
	}
	public Human(String name,int age,char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		humanCount++;
	}
	public Human(Human h){
		this.name = h.name;
		this.age = h.age;
		this.gender = h.gender;
		humanCount++;
	}
	public void showDetails(){
		System.out.println(humanCount+". name : "+name+" , age : "+age+" , gender : "+gender);
	}
}
class StaticExample{
	public static void main(String[] args){
		Human human1= new Human();
		human1.name = "Shonima Minhas";
		human1.age = 20;
		//human1.gender = 'F';
		human1.showDetails();
		//Human.humanCount++;
		
		Human h2= new Human("Ekansh",20,'M');
		h2.showDetails();
		
		Human h3= new Human("Man ki Preet",19,'M');
		h3.showDetails();
		
		Human h4= new Human(h3);
		h4.showDetails();
		System.out.println(Human.humanCount);
	}
}