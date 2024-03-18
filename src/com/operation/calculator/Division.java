package com.operation.calculator;

public class Division {
public double Division(double num1 , double num2)
{ 
	if(num2==0) {
		System.out.println("Error! can't be divisable by zero");
	}
	else {
		return num1/num2;
	}
	return Double.NaN;
}

}
