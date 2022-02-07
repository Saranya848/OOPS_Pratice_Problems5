package com.day5;
interface Measure{
	void display();
	
}
interface Square extends Measure{
	void area();
}
public class InterfaceInheritance implements Square {
	public void display()
	{
		System.out.println("The area of Square is: ");
	}
    public void area() {
	int l = 20;
	int b = 40;
	int a = l * b;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfaceInheritance i = new InterfaceInheritance();
i.display();
i.area();
	}

}
