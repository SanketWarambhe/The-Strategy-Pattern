package com.design.patterns.strategy.duck;

import com.design.patterns.strategy.flyBehaviour.FlyNoWay;
import com.design.patterns.strategy.quackBehaviour.Squeak;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}
	
	public void display() {
		System.out.println("I'm a Model Duck");
	}
	
}
