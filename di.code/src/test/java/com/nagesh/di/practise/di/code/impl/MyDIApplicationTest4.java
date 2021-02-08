package com.nagesh.di.practise.di.code.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationTest4 {
	private MessageServiceInjector injector;

	@Before
	public void setUp() throws Exception {
		injector = new MessageServiceInjector() {

			@Override
			public Consumer getConsumer() {
				return new MyDIApplication(new EmailMessageServiceImpl());
			}
		};
	}

	@After
	public void tearDown() throws Exception {
		injector = null;
	}

	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.sendMessage("Hello junit4 email msg", "nagesh@junit4");
	}

}
