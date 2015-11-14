package com.design.builder;

public class Worker {
	Builder builder;

	public Worker(Builder builder) {
		this.builder = builder;
	}

	public void doSomething() {
		builder.simpleOperation();
	}
}
