class Animal{
	private boolean poonchh;
	protected String genus;
	public String species;
	Animal(){
		
	}
	Animal(boolean poo){
		this.poonchh = poo;
	}
}
class Human extends Animal{
	public char gender;
	public int age;
	Human(){
		
	}
	Human(char g,int a,String s,String gn,boolean po){
		super(po);
		gender = g;
		age = a;
		species = s;
		genus = gn;
	}
	Human(Human human){
		this.gender = human.gender;
		this.age = human.age;
		this.species = human.species;
		this.genus = human.genus;
	}
}
class SoftwareDeveloper extends Human{
	double salary;
	SoftwareDeveloper(Human human){
		super(human);
	}
	SoftwareDeveloper(double sa,char g,int a,String s,String gn,boolean po){
		super(g,a,s,gn,po);
		salary = sa;
	}
	public void showDetails(){
		System.out.println("Salary : "+salary);
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
		System.out.println("species : "+species);
		System.out.println("genus : "+genus);
	}
}
class InheritanceDemo{
	public static void main(String[] args){
		Human mani = new Human();
		mani.gender = 'f';
		mani.age = 19;
		//mani.poonchh = true;
		mani.genus = "homo";
		mani.species = "sapiens";
		
		SoftwareDeveloper komal = new SoftwareDeveloper(mani);
		komal.salary = 100000000000000.0;

		komal.showDetails();
		SoftwareDeveloper richa = new SoftwareDeveloper(-10000.0,'f',20,"sepiens","homo",true);
		richa.showDetails();
	}
}