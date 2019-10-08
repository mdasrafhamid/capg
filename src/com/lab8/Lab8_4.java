package com.lab8;

public class Lab8_4 {

	public static void main(String[] args) {
		
		try {
//			System.out.println(10/0);//problem stmnt
			System.out.println(10/1);//correct stmnt
		} catch (Exception e) {
			System.out.println("exception occured");
//			e.printStackTrace();
		} finally {
			System.out.println("finally here");
			//prints regardless of exception
		}
		System.out.println("this will print");
	}

}
