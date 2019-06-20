abstract class BeingSundar{
	abstract void goods();
	abstract void bads();
	public void complications(){
		System.out.println("it's complicated...");
	}
}	
class Mayank extends BeingSundar{
	@Override
	public void goods(){
		System.out.println("1. Sundar ladkiyo ki kami nhi...");
		System.out.println("2. Overconfidence ki me bahot sundar hu...");
		System.out.println("3. Modeling kr skte hai...");
	}
	@Override
	public void bads(){
		System.out.println("1. Dosro ko judge ya comment krna ...");
		System.out.println("2. Shoes ka color match krna chahiye");
		System.out.println("3. ladkiyo ki kami nhi...");
	}
	public void intro(){
		System.out.println("i am mayank...");
	}
}
class Priya extends BeingSundar{
	public void goods(){
		System.out.println("1. kuchh bhi pahan lo achhe lagte ho...");
	}
	@Override
	public void bads(){
		System.out.println("1. ladko ki lammbi line...");
	}
}

class Oops4{
	public static void main(String[] args){
		BeingSundar sundar = new Mayank();
		sundar.goods();
		sundar.bads();
		sundar.complications();
		
		sundar = new Priya();
		sundar.goods();
		sundar.bads();
	}
}