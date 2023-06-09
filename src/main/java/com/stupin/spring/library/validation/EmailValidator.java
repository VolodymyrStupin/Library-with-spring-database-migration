package com.stupin.spring.library.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

@Component
public class EmailValidator implements ConstraintValidator<EmailValid, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value != null && value.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}

}
