package designPatterns.decorator.car;

import designPatterns.decorator.Icar;

public class WaterCar extends SupperCar {

	public WaterCar(Icar car) {
		super(car);
	}

	public void swim() {
		System.out.println("潜水车,潜水");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}
