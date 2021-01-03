package com.design.patterns.strategy.duck;

import com.design.patterns.strategy.flyBehaviour.FlyNoWay;
import com.design.patterns.strategy.quackBehaviour.QuackNoWay;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new QuackNoWay();
	}
	
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}
	
}
