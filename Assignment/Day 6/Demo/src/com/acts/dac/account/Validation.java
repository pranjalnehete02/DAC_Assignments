package com.acts.dac.account;

import java.time.LocalDate;

public class Validation {

	public static LocalDate dateValidation(String str) throws InvalidDateException {
		LocalDate parse = LocalDate.parse(str);
		LocalDate now = LocalDate.now();
		if(parse.isAfter(now)) {
			throw new InvalidDateException("its future date...!!");
		}
		
		return parse;
	}
	
	public static double balanceValidation(double bal) throws InvalidDateException {
		if(bal <= 1000) {
			throw new InvalidDateException("min balace should be 1000...!");
		}
		return bal;
	}
	
	
}
