package com.grocerystore;

public class InvalidInputException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4594236466978803075L;
	String msg;
	InvalidInputException(String s){
		msg=s;
	}
	
	public String toString() {
		
		
		return "InvalidInputException: "+msg;
	}

}
