package com.lab8;

public class Lab8_3 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("exception occured");
			e.printStackTrace();
		}
		System.out.println("this will print");
		
		

	}

}
