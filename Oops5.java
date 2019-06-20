interface BeingSundar{
	void goods();
	void bads();
	/*public void complications(){
		System.out.println("it's complicated...");
	}*///interface cannot have a body method
	default void complications(){
		System.out.println("it's complicated...");
	}
}	
class Mayank implements BeingSundar{
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
class Priya implements BeingSundar{
	public void goods(){
		System.out.println("1. kuchh bhi pahan lo achhe lagte ho...");
	}
	@Override
	public void bads(){
		System.out.println("1. ladko ki lammbi line...");
	}
}

class Oops5{
	public static void main(String[] args){
		BeingSundar sundar = new Mayank();
		sundar.goods();
		sundar.bads();
		sundar.complications();
		
		sundar = new Priya();
		sundar.goods();
		sundar.bads();
		
		sundar = new BeingSundar(){
			public void goods(){
				System.out.println("1. Bachhe bhi sundar hoge");
			}
			@Override
			public void bads(){
				System.out.println("1. koi gaurantee nhi hai bachha gora hoga...");
			}
		};
		sundar.goods();
		sundar.bads();
		
		new BeingSundar(){
			public void goods(){
				System.out.println("1. Ease to interact and get attention easily");
				System.out.println("2. Easy friendship");
			}
			@Override
			public void bads(){
				System.out.println("1. Jalne wale log...");
			}
		}.goods();
	}
}