package com.lab8;

class MyMath{
		
		int div(int a,int b) {
			return a/b;
		}
		int divThrows(int a,int b) throws ArithmeticException{
			return a/b;
		}
	}

public class Lab8_7 {

	public static void main(String[] args) {
		MyMath m = new MyMath();
//		m.div(10, 0);
//		m.divThrows(10, 0);
//		throw new ArithmeticException();
		
//		System.out.println("abc");

	}

}
