import java.util.*;
class AgeException extends Exception{
	public AgeException(String msg){
		super(msg);
	}
}
class ExceptionHandling2{
	private static void verifyAge(int age) throws AgeException{
		if(age<18){
			throw new AgeException("You can not vote");
		}else{
			System.out.println("you can vote");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		try{
			verifyAge(age);
		}catch(AgeException e){
			System.out.println(e);
		}
		finally{
			System.out.println("I am finally and i always run...");
		}
	}
}