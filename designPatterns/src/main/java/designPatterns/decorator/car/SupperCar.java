package designPatterns.decorator.car;

import designPatterns.decorator.Icar;

public class SupperCar implements Icar {
	private Icar car;
	
	public SupperCar(Icar car) {
		super();
		this.car = car;
	}


	@Override
	public void move() {
		car.move();
	}

}
