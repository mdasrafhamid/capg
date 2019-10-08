package com.capgemini.beantest;

import com.capgemini.beans.LoginBean;

public class LoginBeanTest {

	public static void main(String[] args) {
		
//		LoginBean lb = new LoginBean();
//		lb.setUsername("imran");
//		lb.setPassword("123456");
		LoginBean lb = new LoginBean("imran","123456");
		
		System.out.println(lb.getUsername());

	}

}
