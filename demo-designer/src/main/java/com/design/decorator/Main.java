package com.design.decorator;

public class Main {
	public static void main(String[] args) {
		ConnreteComponent connereteCompontent = new ConnreteComponent();

		ConcreteDecoratorA a = new ConcreteDecoratorA(connereteCompontent);
		a.sampleOperation();

		ConcreteDecoratorB b = new ConcreteDecoratorB(connereteCompontent);
		b.sampleOperation();
	}
}
