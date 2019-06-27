import java.util.*;
class ExceptionHandling{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=0,b,c;
		try{
			System.out.println("Enter a = ");
			a = sc.nextInt();
			System.out.println("Enter b = ");
			b = sc.nextInt();
			c = a / b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("I am finally and i always run...");
		}
		System.out.println("program is still working...");
		
	}
}