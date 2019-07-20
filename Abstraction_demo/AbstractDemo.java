package pck2;
import pck1.Car;
import pck1.Vehicle;
import pck1.MotorCycle;
import java.util.Scanner;
 
class AbstractDemo{
	public static void main(String[] args){
		String brand;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gaadi name : ");
		brand = sc.next();
		System.out.println("Kitna chalaoge : ");
		d = sc.nextInt();
		Car car = new Car(brand);
		Vehicle v = car;
		MotorCycle bike = new MotorCycle(brand);
		Buyer mansi = new Buyer(bike);
		
		Buyer ekansh = new Buyer(new Vehicle(){
			public void move(int distance){
				System.out.println("dhrooommmmmmmmm : "+distance);
			}
		});
		ekansh.gaadiChal(1000);
		mansi.gaadiChal(d);
	}
}

