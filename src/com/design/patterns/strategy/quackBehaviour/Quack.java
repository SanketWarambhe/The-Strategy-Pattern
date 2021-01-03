package com.design.patterns.strategy.quackBehaviour;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack normally");
	}

}
