package com.assignments.BigDecimalDemo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalDemo {
	
	public String roundOf(String number) {
		BigDecimal num = new BigDecimal(number);
		num = num.setScale(5, RoundingMode.HALF_UP);
		MathContext context = new MathContext(25, RoundingMode.HALF_UP);
		num = num.round(context);
		//System.out.println(num);
		return num.toString();
		
	}
}
