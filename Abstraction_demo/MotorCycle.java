package pck1;

public class MotorCycle implements Vehicle{
	String brand;
	public MotorCycle(String b){
		brand = b;
	}
	public void move(int distance){
		System.out.println("Motor brand : "+brand);
		System.out.println("distance : "+distance);
	}
}

