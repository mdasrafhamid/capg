package com.lab3;

/**
 * This class have a method "display" which displays a message on console
 */
class Cls2 {

	/**
	 * ignore what is public, void here that we will learn when we will see the
	 * method signature in details
	 */
	//Lab3.2 Overriding Default Constructor
	public Cls2() {
		System.out.println("Inside the default constructor of Cls2");
	}
	
	//Lab3.3 Adding parameterized constructor
	public Cls2(String name){
		System.out.println("Hi " + name 
              + " you are Inside parametrized constructor of Cls2");
	}
	
	
	public void display() {
		System.out.println("Hi.... You are in display method of cls2");
	}
}

public class Cls1 {

	public static void main(String[] args) {
		// instantiating object of Cls2
		Cls2 cls2Obj = new Cls2();

		//Lab3.3 Instantiate obj
		//using parameterized constructor
		Cls2 cls2Obj2 = new Cls2("MyName");
		
		// calling display method of Cls2
		cls2Obj.display();
	}

}
