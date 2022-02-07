package com.day5;
abstract class Shapes{
	abstract void display();
}
class Rect extends Shapes{
	void display() {
		
		System.out.println("The diagram display is Rectangle");
		
	}
	
}
class Circle extends Shapes{

	void display() {
		System.out.println("The diagram display is  Circle");
	}
	
}
public class AbstractOfShapes {

	public static void main(String[] args) {
		Shapes sh=new Rect();
		Shapes sh1=new Circle();
		sh.display();
		sh1.display();
	}

}
