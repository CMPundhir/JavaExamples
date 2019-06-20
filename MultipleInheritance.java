interface A{
	public void method();
}
interface B{
	public void method();
}
class C implements B,A{
	public void method(){
		System.out.println("I am A");
	}
}
class MultipleInheritance{
	public static void main(String[] args){
		C c = new C();
		c.method();
		
		A a = new A(){
			public void method(){
				System.out.println("HAHhahahahahhaha");
			}
		};
		a.method();
	}
}