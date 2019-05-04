package designPatterns.decorator.car;

import designPatterns.decorator.Icar;

public class FlayCar extends SupperCar {

	public FlayCar(Icar car) {
		super(car);
	}
	
	public void flay() {
		System.out.println("飞行车,飞");
	}
	
	@Override
	public void move() {
		super.move();
		flay();
	}
}
