//why we use methods?
//1.code reusability
//2.makes our program easy to write and understand with clean code 
class MethodsDemo{
	public static void show(){
		System.out.println("Bakwaasaassssss");
	}
	public static int add(){
		return 2+5;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	//arr[]
	public static int average(int[] arr){
		int numOfSub = arr.length;
		int totalMarks = 0;
		for(int marks : arr){
			totalMarks = totalMarks + marks;
		}
		int avg = totalMarks/numOfSub;
		return avg;
	}
	public static void main(String[] args){
		show();
		int a = add();
		System.out.println(a);
		int b = mul(7,2);
		System.out.println(b);
		int[] arr = {100,89,98,90,32};
		int avg = average(arr);
		System.out.println(avg);
		int[] arr2 = {0,5,7,12,16};
		int avg2 = average(arr2);
		System.out.println(avg2);
	}
}