package com.capgemini.visibility;
class Pot{
	
}


public class Protecttest {
	protected int q=90;
	public static void main(String[] args) {
		Pot t = new Pot();
		System.out.println(new Protecttest().q);
		System.out.println();
		

	}

}
