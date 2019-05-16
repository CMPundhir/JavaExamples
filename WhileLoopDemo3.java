import java.util.Scanner;
class WhileLoopDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int i=1;
		while(i<11){
			System.out.println(a+" * "+i+" = "+i*a);
			i++;
			//try{Thread.sleep(5000);}catch(Exception e){}
		}
		for(int j=1;j<11;j++){
			System.out.println(a+" * "+j+" = "+j*a);
		}
	}
}