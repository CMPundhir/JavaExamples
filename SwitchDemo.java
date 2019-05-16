import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		String day = null;
		switch(a){
			case 0: day = "Sunday";break;
			case 1: day = "Monday";break;
			case 2: day = "Tuesday";break;
			case 3: day = "Wednesday";break;
			case 4: day = "Thursday";break;
			case 5: day = "Friday";break;
			case 6: day = "Saturday";break;
			default: day = "Error : wrong number input";
		}
		System.out.println(day);
	}
}