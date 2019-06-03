package org.bazinga.service.impl;

import org.bazinga.service.ValidationService;
import org.bazinga.service.pojo.ValidationParameter;

public class ValidationServiceImpl implements ValidationService {

	public void save(ValidationParameter parameter) {
		System.out.println(parameter);
		System.out.println("save successfully");
	}

	public void update(ValidationParameter parameter) {
		System.out.println(parameter);
		System.out.println("update successfully");
	}

	public void delete(long id, String operator) {
		System.out.println(id + "" + operator);
		System.out.println("delete successfully");
	}

}