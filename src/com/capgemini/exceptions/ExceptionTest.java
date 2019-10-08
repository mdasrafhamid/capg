package com.capgemini.exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int a = 1/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("help");

	}

}
