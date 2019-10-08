package com.Lab4;

//1)abstract class with no abstract methods
abstract class Abs{ //abstract keyword is sufficient to make class abstract,
					//even if no abstract methods inside
	
	void nonStat(){ //non-abstract method
		System.out.println("abs class but no abs method");
	}
	
	//2)Abstract method without 'abstract' keyword
	//void stat(); //cannot do this without adding abstract
	void stat(){
		System.out.println("abstract method");
		
		
	}
	
}

public class ForAbstractPractice {

	public static void main(String[] args) {
		
		//3i)cannot instantiate object of abstract class
		//Abs abs = new Abs();//compile-error
		
		//3ii)Hence, cannot call abstract method
		//abs.stat();
		float a = 33.44f;
		System.out.println(a);

	}
	
	

}
