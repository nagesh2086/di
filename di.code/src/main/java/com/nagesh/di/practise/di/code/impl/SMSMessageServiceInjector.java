package com.nagesh.di.practise.di.code.impl;

public class SMSMessageServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSMessageServiceImpl());
	}

}