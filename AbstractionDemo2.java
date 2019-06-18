interface Shape{
	void draw();
	public static void paint(){
		System.out.println("rainbow...");
	}
}
class Rectangle implements Shape{
	public void draw(){
		System.out.println("Draw a rectangle...");
	}
}
class Circle implements Shape{
	public void draw(){
		System.out.println("Draw a circle...");
	}
}
class AbstractionDemo2{			
	public static void main(String[] args){
		Shape shape = new Rectangle();
		shape.draw();
		Shape.paint();
		shape = new Circle();
		shape.draw();
	}
}