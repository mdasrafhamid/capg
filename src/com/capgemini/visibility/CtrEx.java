package com.capgemini.visibility;

public class CtrEx {

	int a = 90;
	void display() {
		System.out.println("lapar");
	}
	{
		System.out.println("unnamed");
	}
	
	public CtrEx() {
		System.out.println("constructor invoked");
	}
	public CtrEx(int a) {
		System.out.println("1 param constructor invoked : "+a);
	}
	public CtrEx(int a,int b) {
		System.out.println("2 param constructor invoked : "+a+", "+b);
	}
	public CtrEx(Integer a,Integer b) {
		System.out.println("2 Integer param constructor invoked : "+a+", "+b);
	}
	public CtrEx(CtrEx obj) {
		System.out.println(obj.a);
	}
	
	public static void main(String[] args) {
		
		CtrEx ctr = new CtrEx();
		CtrEx ctr1 = new CtrEx(1);
		CtrEx ctr2 = new CtrEx(ctr1);
		

	}

}
