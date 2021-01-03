package com.design.patterns.strategy.apps;

import com.design.patterns.strategy.duck.Duck;
import com.design.patterns.strategy.duck.MallardDuck;
import com.design.patterns.strategy.duck.ModelDuck;
import com.design.patterns.strategy.duck.RubberDuck;
import com.design.patterns.strategy.flyBehaviour.FlyWithRocketPower;

public class SimulationDuck {

	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("==================");
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		System.out.println("==================");
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();
		
		//Changing behaviour on on the fly:
		modelDuck.setFlyBehaviour(new FlyWithRocketPower());
		modelDuck.performFly(); //Now flying with rocket power
	}

}
