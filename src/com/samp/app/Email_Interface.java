package com.samp.app;

public interface Email_Interface {

	int PORT_NO=8989;
	String Host_name="192.168.1.1";
	
	boolean send(String from, String to, String subject);
	boolean receive(String body);
	boolean delete_msg(int msgno);
}
