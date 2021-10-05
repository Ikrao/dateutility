package com.ust.adddaystodate.service;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DayorMonthNotFoundException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DayorMonthNotFoundException(String exception) {
		super(exception);
	}
	
}
