package com.nagesh.di.practise.di.code.impl;

public class MyDIApplication implements Consumer {
	private MessageService service = null;

	public MyDIApplication(MessageService service) {
		this.service = service;
	}

	@Override
	public void sendMessage(String msg, String recipient) {
		this.service.sendMessage(msg, recipient);
	}

}
