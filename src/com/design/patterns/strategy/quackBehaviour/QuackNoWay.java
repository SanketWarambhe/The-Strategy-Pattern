package com.design.patterns.strategy.quackBehaviour;

public class QuackNoWay implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Can not quack");
	}

}
