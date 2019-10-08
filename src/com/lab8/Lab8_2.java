package com.lab8;

class Mtd2{
	void divZero() {
		System.out.println(10/0);
	}
}

public class Lab8_2 {

	public static void main(String[] args) {
		Mtd2 m2 = new Mtd2();
		m2.divZero();

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero 
 * 		at com.lab8.Mtd2.divZero(Lab8_2.java:5) 
 * 		at com.lab8.Lab8_2.main(Lab8_2.java:13)
 */
		//exception call stack
		
	}

}
