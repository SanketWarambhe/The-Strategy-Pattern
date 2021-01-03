package com.design.patterns.strategy.duck;

import com.design.patterns.strategy.flyBehaviour.FlyWithWings;
import com.design.patterns.strategy.quackBehaviour.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a Mallard Duck");
	}
	
}
