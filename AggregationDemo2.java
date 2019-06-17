class Address{
	int hNo;
	String street;
	int pincode;
	String city;
	public Address(int hNo,String street,int pincode,String city){
		this.hNo = hNo;
		this.street = street;
		this.pincode = pincode;
		// this.city = city;
	}
	@Override
	public String toString(){
		return "Address{\n house no : "+hNo+",\n street : "+street+",\n pincode : "+pincode+",\n city : "+city+"}";
	}
}
class Student{
	int rn;
	String name;
	Address addr;
	public Student(int rn,String name,Address addr){
		this.rn = rn;
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString(){
		return "Student{\n roll no :"+rn+",\n name : "+name+",\n address : "+addr+"}";
	}
}
class AggregationDemo2{
	public static void main(String[] args){
		Address addr = new Address(108,"A- Block",110033,"Delhi");
		Student s = new Student(1,"Tanishq",addr);
		System.out.println(s);
	}
}