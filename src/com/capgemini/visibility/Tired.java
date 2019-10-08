package com.capgemini.visibility;

class Happy{
	
	void display(){
		System.out.println("message");
	}
}

public class Tired {

	public static void main(String[] args) {
		
		Happy h = new Happy();
		h.display();
	}

}
