package com.lab3;

class MyMath {

	double add(double a, double b) {
		return a + b;
	}

	double sub(double a, double b) {
		return a - b;
	}

	double mul(double a, double b) {
		return a * b;
	}

	double div(double a, double b) {
		return a / b;
	}
}

public class Mainclass {

	public static void main(String[] args) {

		//double a = 23.5;
		//double b = 12;
		
		//Lab 3.5 using command line arguments
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		
		MyMath m = new MyMath();
		System.out.println("Sum of " + a + "and " + b + " : " + m.add(a, b));
		System.out.println("Subtraction of " + a + " and " + b + " : " + m.sub(a, b));
		System.out.println("Multiplication of " + a + " and " + b + " : " + m.mul(a, b));
		System.out.println("Division of " + a + " and " + b + " : " + m.div(a, b));
	}

}
