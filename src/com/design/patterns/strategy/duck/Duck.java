package com.design.patterns.strategy.duck;

import com.design.patterns.strategy.flyBehaviour.FlyBehaviour;
import com.design.patterns.strategy.quackBehaviour.QuackBehaviour;

public abstract class Duck {

	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public Duck() {
		//no args constructor
	}
	
	public abstract void display();
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks can float");
	}
	
}
