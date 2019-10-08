package com.capgemini.beans;

public class OCBCLoginBean {

	String accessCode;
	int pin;
	
	public OCBCLoginBean(){}
	
	public OCBCLoginBean(String accessCode,int pin){
		this.accessCode = accessCode;
		this.pin = pin;
	}
	
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
