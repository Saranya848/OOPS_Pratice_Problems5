package com.day5;
interface MyInterface{
	   public static int d = 100;
	   public void display();
	}
public class InterfaceAccess  implements MyInterface{
	   public static int d = 10000;
	   public void display() {
	      System.out.println("This is the implementation of the display method");
	   }
	   public void show() {
	      System.out.println("This is the implementation of the show method");
	   }
	   public static void main(String args[]) {
		   InterfaceAccess obj = new InterfaceAccess();
	      System.out.println("Value of num of the interface "+MyInterface.d);
	      System.out.println("Value of num of the class "+obj.d);
	   }
	}