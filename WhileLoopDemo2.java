import java.util.Scanner;
class WhileLoopDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int max=0,min=0;
		//min = Integer.MAX_VALUE;
		//max = Integer.MIN_VALUE;
		while(a!=0){
			a = sc.nextInt();
			if(a>max){
				max = a;
			}
			if(a<min){
				min = a;
			}
		}
		System.out.println("min : "+min);
		System.out.println("max : "+max);
		System.out.println("loop finished");
	}
}
		