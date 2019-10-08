package com.capgemini.exceptions;

class Server{
	void start() {
		System.out.println("server started..");
	}
}


public class ServerExample {

	public static void main(String[] args) {
		Server s1 = new Server();
		Server s2 = new Server();
		Server s3 = new Server();
		
		try {
			s1.start();
//			int a=1/0;
			int [] a= new int[2];
			a[2]=2;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("s1 crashed, s2 about to start");
			
			try {
				s2.start();
				int a=1/0;
			} catch (Exception e1) {
				System.out.println("s2 crashed, s3 about to start");
				try {
					s3.start();
				} catch (Exception e2) {
					System.out.println("all servers crashed!");
				}
			}
			finally {
				System.out.println("finally");
			}
		} catch(ArrayIndexOutOfBoundsException eb) {
			System.out.println("out of bounds");
			eb.printStackTrace();
		}
		
	}

}
