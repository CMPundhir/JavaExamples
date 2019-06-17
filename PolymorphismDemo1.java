//Type of polymorphism
//1. static - overloading
//2. Duynamic - overriding
class PolymorphismDemo1{
	
	public static int add(int a,int b){
		return a+b;
	}
	//overloading by changing number of parameters
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	//overloading by changing datatype
	public static float add(float a, float b){
		return a+b;
	}
	public static void main(String[] args){
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1.0f,2.3f));
		System.out.println(add(1,2.3f));//automatic type casting / type promotion
	}
}