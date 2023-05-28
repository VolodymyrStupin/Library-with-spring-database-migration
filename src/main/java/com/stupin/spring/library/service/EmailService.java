package com.stupin.spring.library.service;

import com.stupin.spring.library.entity.User;

public interface EmailService {
	
	void sendUserRegistrationConfirmEmail(User user);
	
	void sendForgotPasswordEmail(User user, String path, String token);

}
