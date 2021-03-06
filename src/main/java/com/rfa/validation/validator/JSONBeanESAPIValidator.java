package com.rfa.validation.validator;

import org.owasp.esapi.ESAPI;

public class JSONBeanESAPIValidator /*extends HibernateValidator*/ {
	private static JSONBeanESAPIValidator instance;

	private JSONBeanESAPIValidator() {}

	public static JSONBeanESAPIValidator getInstance() {
		if (instance == null)
			instance = new JSONBeanESAPIValidator();
		return instance;
	}

	private org.owasp.esapi.Validator validator() {
		return ESAPI.validator();
	}
}
