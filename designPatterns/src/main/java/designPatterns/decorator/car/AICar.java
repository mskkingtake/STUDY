package designPatterns.decorator.car;

import designPatterns.decorator.Icar;

public class AICar extends SupperCar {

	public AICar(Icar car) {
		super(car);
	}
	
	public void ai() {
		System.out.println("智能车,自动行驶");
	}
	
	@Override
	public void move() {
		super.move();
		ai();
	}
}
