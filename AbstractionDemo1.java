abstract class Shape{
	abstract void draw();
	public void paint(){
		System.out.println("rainbow...");
	}
}
class Rectangle extends Shape{
	public void draw(){
		System.out.println("Draw a rectangle...");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Draw a circle...");
	}
}
class AbstractionDemo1{			
	public static void main(String[] args){
		Shape shape = new Rectangle();
		shape.draw();
		shape.paint();
		shape = new Circle();
		shape.draw();
	}
}