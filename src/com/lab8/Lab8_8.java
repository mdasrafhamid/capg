package com.lab8;
class userDefException extends Exception{
	
	public String toString() {
		return "userDefException";
	}
}


public class Lab8_8 {

	public static void main(String...args) {
		
		try {
			throw new userDefException();
			
		} catch (userDefException e) {
			System.out.println(e);
		}
		
	}
}
