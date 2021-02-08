package com.nagesh.di.practise.di.code.impl;

public class EmailMessageServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailMessageServiceImpl());
	}

}
