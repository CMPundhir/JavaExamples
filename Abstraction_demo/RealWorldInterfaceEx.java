import java.util.Scanner;

interface Transportation{
	int getRatePerKm();
	int getFixedCharge();
	default float getFare(float distance){
		float fare = getFixedCharge() + (distance - 1) * getRatePerKm();
		return fare;
	}
}
class Metro implements Transportation{
	public int getRatePerKm(){
		return 5;
	}
	public int getFixedCharge(){
		return 10;
	}
}
class Ola implements Transportation{
	public int getRatePerKm(){
		return 6;
	}
	public int getFixedCharge(){
		return 25;
	}
}

class ByWalk implements Transportation{
	public int getRatePerKm(){
		return 0;
	}
	public int getFixedCharge(){
		return 0;
	}
}

public class RealWorldInterfaceEx{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello  please select mode of transportation : ");
		System.out.println("Options are : ");
		System.out.println("1. Metro");
		System.out.println("2. Ola");
		int choice = sc.nextInt();
		Transportation transportation = null;
		switch(choice){
			case 1 : transportation = new Metro();break;
			case 2 : transportation = new Ola();break;
			default : transportation = new ByWalk();break;
		}
		System.out.println("Enter distance : ");
		int distance = sc.nextInt();
		float fare = transportation.getFare(distance);
		System.out.println("fare : "+fare);
	}
}



