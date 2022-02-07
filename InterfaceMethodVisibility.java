package com.day5;
interface measure{
	void area();
}
class Sq implements measure {
	int l, b;
	void area(int l, int b) {
		int var = l * b;
	}
}
public class InterfaceMethodVisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sq aa = new Sq();
      aa.area();
	}

}
