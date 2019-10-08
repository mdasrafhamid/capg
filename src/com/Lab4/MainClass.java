package com.Lab4;

public class MainClass {

	interface IMyMath{
		int add(int a,int b);
		int sub(int a,int b);
		int mul(int a,int b);
		int div(int a,int b);
		
	}
	
	class MyMath implements IMyMath{

		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}

		@Override
		public int sub(int a, int b) {
			// TODO Auto-generated method stub
			return a-b;
		}

		@Override
		public int mul(int a, int b) {
			// TODO Auto-generated method stub
			return a*b;
		}

		@Override
		public int div(int a, int b) {
			// TODO Auto-generated method stub
			return a/b;
			
//			int a = 90;
		}
		
		
	}
	
	public static void main(String[] args) {
		int a=90;
		

	}

}
