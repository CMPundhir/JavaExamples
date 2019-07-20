package pck2;
import pck1.Vehicle;

class Buyer{
	Vehicle gaadi;
	Buyer(Vehicle v){
		gaadi = v;
	}
	public void gaadiChal(int d){
		gaadi.move(d);
	}
}

