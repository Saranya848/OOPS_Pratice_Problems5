package com.day5;

public class PassbyReference {
int n=10;
void change(PassbyReference pm){  
    pm.n=pm.n+100;//changes in the instance variable  
   }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassbyReference pm = new PassbyReference(); 
	       System.out.println("The Call by Reference:");
	          System.out.println("before change "+pm.n);  
	          pm.change(pm);//object passing
	          System.out.println("after change "+pm.n);
	}

}
