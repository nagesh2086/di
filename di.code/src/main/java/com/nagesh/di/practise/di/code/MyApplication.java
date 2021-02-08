package com.nagesh.di.practise.di.code;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private EmailService mailService = new EmailService();
	
	public void processMessage(String msg, String recipient) {
		mailService.sendEmail(msg, recipient);
	}
}
