package pck1;

public class Car implements Vehicle{
	String brand;
	public Car(String b){
		brand = b;
	}
	public void move(int distance){
		System.out.println("brand : "+brand);
		System.out.println("distance : "+distance);
	}
}

