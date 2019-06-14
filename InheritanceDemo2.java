class Car{
	int engine;
	int nitro;
	int now;
	String transMode;
	public Car(){
		System.out.println("car object created");
	}
	public Car(int engine,int nitro,int now,String transMode){
		System.out.println("car object created");
		this.engine = engine;
		this.nitro = nitro;
		this.now = now;
		this.transMode = transMode;
	}
	public void show(){
		System.out.println("engine : "+engine);
		System.out.println("nitro : "+nitro);
		System.out.println("no of wheels : "+now);
		System.out.println("transMode : "+transMode);
	}
}
class Suzuki extends Car{
	String color;
	int bootSpace;
	float mileage;
	String musicSystem;
	boolean hockeySticker;
	public Suzuki(){
		super();
		System.out.println("");
	}
	public Suzuki(int engine,int nitro,int now,String transMode,String color,int bootSpace,float mileage,String musicSystem,boolean hockeySticker){
		super(engine,nitro,now,transMode);
		System.out.println("");
		this.color = color;
		this.bootSpace = bootSpace;
		this.mileage = mileage;
		this.musicSystem = musicSystem;
		this.hockeySticker = hockeySticker;
	}
	@Override
	public void show(){
		super.show();
		System.out.println("color : "+this.color);
		System.out.println("bootSpace : "+bootSpace);
		System.out.println("mileage : "+mileage);
		System.out.println("musicSystem : "+musicSystem);
		System.out.println("hockeySticker : "+hockeySticker);
	}
}
class InheritanceDemo2{
	public static void main(String[] args){
		Suzuki alto800 = new Suzuki();
		alto800.color = "Red";
		alto800.bootSpace = 500;
		alto800.mileage = 100.0f;
		alto800.musicSystem = "Herman";
		alto800.hockeySticker = true;
		alto800.engine = 1200;
		alto800.nitro = 500;
		alto800.now = 6;
		alto800.transMode = "hybrid";
		alto800.show();
		
		Suzuki wgR = new Suzuki(2000,1500,8,"Automatic","Rainbow",100,10.0f,"Sony",false);
		wgR.show();
	}
}