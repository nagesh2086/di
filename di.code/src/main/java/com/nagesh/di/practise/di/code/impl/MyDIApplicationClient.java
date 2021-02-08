package com.nagesh.di.practise.di.code.impl;

public class MyDIApplicationClient {

	public static void main(String[] args) {

		MessageServiceInjector injector = null;
		Consumer consumer = null;

		injector = new EmailMessageServiceInjector();
		consumer = injector.getConsumer();
		consumer.sendMessage("Hello DI", "nagesh@di");

		injector = new SMSMessageServiceInjector();
		consumer = injector.getConsumer();
		consumer.sendMessage("Hello DI Your SMS", "nagesh@di77");
	}

}
