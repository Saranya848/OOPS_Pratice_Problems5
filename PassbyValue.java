package com.day5;

public class PassbyValue {
int n=10;  
    
    void change(int n){  
    n=n+100;//changes in the local variable only  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.out.println("The Call by Value:");
	      PassbyValue pm = new PassbyValue();  
	     
	      System.out.println("before change "+pm.n);  
	      pm.change(100);  
	      System.out.println("after change "+pm.n);
	}

}
