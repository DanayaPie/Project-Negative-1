package com.revature.service;

import org.apache.commons.math3.util.Precision;

public class ArithmeticService {

	public String doAddition(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double addition = number1 + number2;

		String result = "" + Precision.round(addition, 2);
		return result;
	}

	public String doSubtraction(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double subtraction = number1 - number2;

		String subResult = "" + Precision.round(subtraction, 2);;
		return subResult;
	}

	public String doMultiplication(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double multiplication = number1 * number2;

		String mulResult = "" + Precision.round(multiplication, 2);
		return mulResult;
	}

	public String doDivision(String number1String, String number2String) {

		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double division = number1 / number2;

		String divResult = "" + Precision.round(division, 2);
		return divResult;
	}

}
