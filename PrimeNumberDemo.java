import java.util.Scanner;
class PrimeNumberDemo{
	//Q. what is a Prime Number?
	//Ans. a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
	
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		if(isPrime(a)){
			System.out.println(a+" is a prime.");
		}else{
			System.out.println(a+" is not a prime.");
		}
	}
}