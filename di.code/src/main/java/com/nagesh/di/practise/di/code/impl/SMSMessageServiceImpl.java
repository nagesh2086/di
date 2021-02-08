package com.nagesh.di.practise.di.code.impl;

public class SMSMessageServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String recipient) {
		System.out.printf("SMS sent %s %s", msg, recipient);
	}

}
