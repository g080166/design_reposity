package com.design.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sampleOperation() {
		System.out.println("i'm concreteDecorator B");

	}
}
