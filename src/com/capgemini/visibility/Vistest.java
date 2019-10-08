package com.capgemini.visibility;

public class Vistest {

	public int a = 90;
	public static final int z = 99;

	public static void main(String[] args) {
		Protecttest t = new Protecttest();
		System.out.println(t.q);
	}
}
