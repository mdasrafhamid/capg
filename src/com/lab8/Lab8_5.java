package com.lab8;

public class Lab8_5 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			//div by 0
		} catch (Exception e) {
			System.out.println("outer error");
			try {
				System.out.println(10/0);
			} catch (Exception e1) {
				System.out.println("inner error");
//				e1.printStackTrace();
			}
			
		}
		

	}

}
