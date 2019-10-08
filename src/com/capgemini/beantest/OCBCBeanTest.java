package com.capgemini.beantest;

import com.capgemini.beans.OCBCLoginBean;

public class OCBCBeanTest {

	public static void main(String[] args) {
		
		OCBCLoginBean bn = new OCBCLoginBean();
		bn.setAccessCode("c150120");
		bn.setPin(123456);
		
		OCBCLoginBean bn2 = new OCBCLoginBean("C120130",654321);
		
		System.out.println(bn.getAccessCode());
		System.out.println(bn2.getAccessCode());

	}

}
