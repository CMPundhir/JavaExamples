import java.util.Scanner;
class DeciToBinDemo{
	
	public static void binToDec(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a binary number : ");
		String num = sc.next();
		int binNum = Integer.parseInt(num,2);
		System.out.println("decimal of "+num+" = "+binNum);
	}
	public static void decToBin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a decimal number : ");
		int num = sc.nextInt();
		String dec = Integer.toBinaryString(num);
		System.out.println("binary of "+num+" = "+dec);
	}
	public static void decToBin2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a decimal number : ");
		int num = sc.nextInt();
		StringBuffer dec = new StringBuffer();
		while(num>0){
			int rem = num%2;
			dec.append(rem);
			num=num/2;
		}
		System.out.println("binary of "+num+" = "+dec.reverse());
	}
	
	public static void main(String[] args){
		decToBin2();
	}
}