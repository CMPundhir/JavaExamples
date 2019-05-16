import java.util.Scanner;
class WhileLoopDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		//while(a>0){
		//	System.out.println("inside loop a = "+a);
		//	a--;
		//}
		//System.out.println("outside loop");
		do{
			System.out.println("inside loop a = "+a);
			a--;
		}while(a>0);
		System.out.println("outside loop");
	}
}