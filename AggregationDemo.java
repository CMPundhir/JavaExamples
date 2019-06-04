class Employee{
	int eId;
	float salary;
	String name;
	String designation;
	Laptop laptop;
	Employee(int id,float sal,String nm,String desig,Laptop ltp){
		eId = id;
		salary = sal;
		name = nm;
		designation = desig;
		laptop = ltp;
	}
	@Override
	public String toString(){
		return "Employee{eId : "+eId+", salary : "+salary+", name : "+name+", designation : "+designation+", laptop : "+laptop+"}";
	}
}
class Laptop{
	String model;
	String brand;
	LaptopConfiguration configuration;
	Laptop(String md,String br,String pr,String rm,String hd,String dis){
		model = md;
		brand = br;
		configuration = new LaptopConfiguration(pr,rm,hd,dis);
	}
	@Override
	public String toString(){
		return "Laptop{model : "+model+", Brand : "+brand+", configuration : "+configuration+"}";
	}
}
class LaptopConfiguration{
	String processor;
	String ram;
	String hdd;
	String display;
	LaptopConfiguration(String pr,String rm,String hd,String dis){
		processor = pr;
		ram = rm;
		hdd = hd;
		display = dis;
	}
	@Override
	public String toString(){
		return "LaptopConfiguration{processor : "+processor+", ram : "+ram+", hdd : "+hdd+", display : "+display+"}";
	}
}
class AggregationDemo{
	public static void main(String[] args){
		Laptop laptop = new Laptop("Pata ni","Dell","i9","32gb","4TB","4k");
		Employee emp = new Employee(1,10000.0f,"Richa","Software Dev",laptop);
		System.out.println(emp);
		//emp.showEmployee();
	}
}

/*
Object is the base class for all other Java classes. This means that all classes implicitly support toString and hashCode. But many classes override one or both, so they don't get Object's default implementations.

For instance, toString of a Double object will return a meaningful default-formatted version of the floating-point number, while hashCode of a double will return a hashed version of the float value, suitable for keying searches in a hashtable.

toString is intended primarily to support debug printing. What it returns is whatever the developer felt made the "most sense" for that specific object class. (For Object there's not much to work with, so the class name in combination with the text representation of the hashCode value is used.) hashCode, on the other hand, is intended to facilitate hash-based searching, and so the developer attempts to produce a number that has a high probability of being different on objects that compare differently, but is guaranteed to be identical on objects that compare as equal.
*/