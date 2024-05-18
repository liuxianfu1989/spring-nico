package com.nico.aop.xml.service;

public class MyCalculator /*implements Calculator*/ {
//	@Override
	public Integer add(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i + j;
		return result;
	}

//	@Override
	public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i - j;
		return result;
	}

//	@Override
	public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i * j;
		return result;
	}

//	@Override
	public Integer div(Integer i, Integer j) throws NoSuchMethodException {
		Integer result = i / j;
		return result;
	}

	public Integer show(Integer i) {
		System.out.println("show......");
		return i;
	}

	@Override
	public String toString() {
		return "super.toString()";
	}
}
