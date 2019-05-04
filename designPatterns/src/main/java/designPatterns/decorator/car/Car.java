package designPatterns.decorator.car;

import designPatterns.decorator.Icar;

public class Car implements Icar {

	@Override
	public void move() {
		System.out.println("普通车,奔跑");
	}

}
