package com.capgemini.visibility;

public class GlobM {

	int x;
	
	public static void main(String[] args) {
		GlobM g1 = new GlobM();
		GlobM g2 = new GlobM();
		
		g1.x = 10;
		g2.x = 12;
		
		System.out.println("g1.x : "+g1.x);
		System.out.println("g2.x : "+g2.x);

	}

}
