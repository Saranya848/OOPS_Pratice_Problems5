package com.day5;
interface Details{
	
	void name();
	void version();
}
class Vehicle implements Details{
	public void name() {
	  String n = "XUV";
		System.out.println("The Vechile name is "+n);
		
	}
	public void version() {
	  float v = 700;
		System.out.println("The Vehicle version is "+v);
		
	}
	
}
public class VehiclesInterface {
	public static void main(String[] args) {
		Vehicle vh=new Vehicle();
		vh.name();
		vh.version();
	}
	}
