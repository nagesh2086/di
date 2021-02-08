package com.nagesh.di.practise.di.code.impl;

public class EmailMessageServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String recipient) {
		// TODO Auto-generated method stub
		System.out.printf("Email sent %s %s", msg, recipient);
	}

}
