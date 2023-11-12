package com.manibabu.com.manibabu.curdapi;

import com.manibabu.com.manibabu.curdapi.interfaces.MathOparation;

public class Oparations implements MathOparation {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		return a/b;
	}

}
