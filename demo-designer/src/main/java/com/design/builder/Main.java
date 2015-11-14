package com.design.builder;

public class Main {

	public static void main(String[] args) {
		Builder hammer = new Hammer();
		Worker work1 = new Worker(hammer);
		work1.doSomething();

		Builder hoe = new Hoe();
		Worker work2 = new Worker(hoe);
		work2.doSomething();
	}
}
