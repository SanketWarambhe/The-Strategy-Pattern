package com.design.patterns.strategy.flyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Cannot fly without wings");
	}

}
